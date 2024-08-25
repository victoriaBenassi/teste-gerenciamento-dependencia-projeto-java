package com.example;

import java.util.UUID;

public class Mensagem {
    private String id;
    private String mensagem;

    public Mensagem(final String mensagem) {
        this.id = UUID.randomUUID().toString(); //essa linha está gerando um identificador único
        /*
        * Este método estático da classe UUID gera um novo identificador único
        * universal (UUID). O UUID é uma string de 36 caracteres (incluindo 4 hífens)
        * que é praticamente garantida para ser única.
        */
        this.mensagem = mensagem;
    }

    public String getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }
}
