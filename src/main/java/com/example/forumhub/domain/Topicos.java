package com.example.forumhub.domain;

import com.example.forumhub.dto.AtualizacaoTopicos;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "topicos")
public class Topicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "titulo")
    @NotNull(message = "Campo Obrigatorio")
    private String titulo;

    @NotNull(message = "Campo Obrigatorio")
    @Column(name = "mensagem")
    private String mensagem;

    @NotNull(message = "Campo Obrigatorio")
    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @NotNull(message = "Campo Obrigatorio")
    @Column(name = "estado_topico")
    private String estado;

    @NotNull(message = "Campo Obrigatorio")
    @Column(name = "autor")
    private String autor;

    @NotNull(message = "Campo Obrigatorio")
    @Column(name = "curso")
    private String curso;

    public void atualizarTopico(AtualizacaoTopicos dados){
        this.mensagem = dados.mensagem();
        this.curso = dados.curso();
        this.estado = dados.estado();
    }

}
