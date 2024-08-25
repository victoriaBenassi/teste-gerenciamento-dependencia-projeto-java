package com.example;
//Capturando objetos

public class ServicoEnvioEmail {

    private PlataformaDeEnvio plataforma;

    void enviarEmail(String enderecoEmail, String mensagem, boolean formatoHtml){
        Email email = null;

        if(formatoHtml){
            email = new Email(enderecoEmail, mensagem, Formato.HTML);
        }
        else {
            email = new Email(enderecoEmail, mensagem, Formato.TEXTO);
        }
        plataforma.enviarEmail(email);
    }
}
