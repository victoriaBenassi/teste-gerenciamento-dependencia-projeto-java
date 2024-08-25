package com.example;
//Capturando objetos

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTest {

    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks
    private ServicoEnvioEmail servico; // injetando o mock na classe de teste

    @Captor //classe do mockito para capturar argumentos de um metodo
    private ArgumentCaptor<Email> captor;


    @Test
    void validarDadosEnviadosParaAPlataforma(){

        String enderecoEmail = "usuario@test.com.br";
        String mensagem = "Ola mundo teste mensagem";
        boolean ehFormatoHtml = false;

        servico.enviarEmail(enderecoEmail, mensagem, ehFormatoHtml);
        Mockito.verify(plataforma).enviarEmail(captor.capture());// verificando no mock qual foi o email enviado e capturando com o captor

        Email emailCapturado = captor.getValue();//pegar o valor

        Assertions.assertEquals(enderecoEmail, emailCapturado.getEnderecoEmail()); //verificando com JUnit se tudo que eu passei é o que foi recebido de la
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem()); //verificando com JUnit se tudo que eu passei é o que foi recebido de la
        Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato()); //verificando com JUnit se tudo que eu passei é o que foi recebido de la


    }
}
