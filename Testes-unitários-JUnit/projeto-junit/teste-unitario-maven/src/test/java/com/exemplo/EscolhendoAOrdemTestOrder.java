package com.exemplo;

import org.junit.jupiter.api.*;

//definindo a ordem que os testes serão executados
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTestOrder {

    @Order(4)
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}
