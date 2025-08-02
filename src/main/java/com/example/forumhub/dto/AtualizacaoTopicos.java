package com.example.forumhub.dto;

import jakarta.validation.constraints.NotNull;

public record AtualizacaoTopicos(
        @NotNull
        String mensagem,
        @NotNull
        String estado,
        @NotNull
        String curso
) {

}
