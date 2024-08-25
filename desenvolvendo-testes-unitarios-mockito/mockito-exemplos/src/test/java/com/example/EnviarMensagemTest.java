package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

//espiando objetos
@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTest {

    @Spy //observar o qye vai acontecer
    private EnviarMensagem enviarMensagem;

    @Test
    void verificarComportamentoDaClasse(){
        Mockito.verifyNoInteractions(enviarMensagem);//verificando se não teve nenhuma interação com a classe

        Mensagem mensagem = new Mensagem("Hello World");
        enviarMensagem.adicionarMensagem(mensagem);//adicionando mensagem enviada

        Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);//verificando se a referencia enviarMnesagem recebeu
        //alguma chamada no adicionarMensagem com o objeto mensagem

        Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());
    }
}
