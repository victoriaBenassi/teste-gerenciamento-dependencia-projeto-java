package com.exemplo;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexão(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.inserirDados(new Pessoa("Vic", LocalDateTime.of(2000,9,1,1,1,1)));
    }

    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("Vic", LocalDateTime.of(2000,9,1,1,1,1)));
    }
    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }
    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertNull(null);
    }
    @AfterAll
    static void finalizarConexão(){
        BancoDeDados.finalizarConexao();
    }
}
