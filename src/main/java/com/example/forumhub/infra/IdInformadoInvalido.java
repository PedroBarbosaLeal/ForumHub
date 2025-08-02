package com.example.forumhub.infra;

public class IdInformadoInvalido extends RuntimeException {
    public IdInformadoInvalido(String message) {
        super(message);
    }
}
