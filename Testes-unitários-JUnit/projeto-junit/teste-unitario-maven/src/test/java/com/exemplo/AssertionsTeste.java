package com.exemplo;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {
    /*
     * comparando arrays
     */
    @Test
    void ValidarLancamentos(){

        int[] primeirolancamento = {10,20,30,40,50};
        int[] segundolancamento = {10,20,30,40,50};

        assertArrayEquals(primeirolancamento,segundolancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("lucia", LocalDateTime.now());
        assertNotNull(pessoa);
    }

    @Test
    void ValidarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
