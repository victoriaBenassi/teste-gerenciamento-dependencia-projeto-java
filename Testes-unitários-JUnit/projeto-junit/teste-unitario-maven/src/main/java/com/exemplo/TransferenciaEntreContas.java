package com.exemplo;

public class TransferenciaEntreContas {

    public void trasfere(Conta contaOrigem, Conta contaDestino, int valor){
        if(valor  <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
    }
}
