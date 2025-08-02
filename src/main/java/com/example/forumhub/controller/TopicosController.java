package com.example.forumhub.controller;
import com.example.forumhub.domain.Topicos;
import com.example.forumhub.service.TopicosService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicosService repository;

    @PostMapping
    public ResponseEntity<?> criarTopico(@RequestBody @Valid Topicos topico){
        repository.criarTopico(topico);
       return ResponseEntity.status(HttpStatus.CREATED).body(topico);
    }

    @GetMapping
    public ResponseEntity<?> listarTopicos(){
        List<Topicos> lista = repository.listarTopicos();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> listarEspecifico(@PathVariable Integer id){
        Topicos topicoEspecifico = repository.buscarTopicoPorId(id);
        return ResponseEntity.status(HttpStatus.OK).body(topicoEspecifico);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarTopico(@PathVariable Integer id){
        Boolean aux = repository.deletar(id);
        if(aux){
            return ResponseEntity.status(HttpStatus.OK).body("Topico deletado com sucesso!");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
