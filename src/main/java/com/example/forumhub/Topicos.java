package com.example.forumhub;

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
    @NotNull
    private String titulo;

    @NotNull
    @Column(name = "mensagem")
    private String mensagem;

    @NotNull
    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @NotNull
    @Column(name = "estado_topico")
    private String estado;

    @NotNull
    @Column(name = "autor")
    private String autor;

    @NotNull
    @Column(name = "curso")
    private String curso;

}
