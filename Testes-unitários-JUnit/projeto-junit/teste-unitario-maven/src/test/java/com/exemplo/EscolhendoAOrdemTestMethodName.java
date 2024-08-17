package com.exemplo;

import org.junit.jupiter.api.*;

//definindo a ordem que os testes serão executados por nome do metodo
@TestMethodOrder(MethodOrderer.MethodName.class)
public class EscolhendoAOrdemTestMethodName {

    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }
}
