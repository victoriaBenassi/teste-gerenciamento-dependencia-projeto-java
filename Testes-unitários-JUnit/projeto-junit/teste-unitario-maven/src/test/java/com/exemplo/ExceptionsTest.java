package com.exemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validarCenarioDeExcesaoNaTransferencia(){
        Conta contaOrigem = new Conta(123456, 0);
        Conta contaDestino = new Conta(789123, 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.trasfere(contaOrigem, contaDestino, -1)); //verifica se esta lançando excessao


        Assertions.assertDoesNotThrow(() ->
                transferenciaEntreContas.trasfere(contaOrigem, contaDestino, 50)); //verifica se alguma coisa não vai lançar excessão
    }
}
