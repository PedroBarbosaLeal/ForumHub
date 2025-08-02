package com.example.forumhub.service;

import com.example.forumhub.domain.Topicos;
import com.example.forumhub.dto.AtualizacaoTopicos;
import com.example.forumhub.infra.IdInformadoInvalido;
import com.example.forumhub.repository.TopicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicosService {

    @Autowired
    private TopicoRepository repository;

    TopicosService(TopicoRepository repository) {
        this.repository = repository;
    }


    public Boolean criarTopico(Topicos topico){
        repository.save(topico);
        return true;
    }

    public List<Topicos> listarTopicos(){
        List<Topicos> lista = repository.findAll();
        return lista;
    }
    public Topicos buscarTopicoPorId(Integer id){
        if(repository.existsById(id)){
            return repository.findById(id).get();
        }else{
            throw new IdInformadoInvalido("Id não encontrado!");
        }

    }
    @Transactional
    public Boolean deletar(Integer id){
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }else{
            throw new IdInformadoInvalido("O Id informado esta invalido");
        }
    }

    @Transactional
    public Boolean atualizarTopico(Integer id, AtualizacaoTopicos dados){
        if(repository.existsById(id)){
            Topicos topicos = repository.findById(id).get();
            topicos.atualizarTopico(dados);
            return true;
        }else{
            throw new IdInformadoInvalido("O Id informado esta invalido");
        }
    }

}
