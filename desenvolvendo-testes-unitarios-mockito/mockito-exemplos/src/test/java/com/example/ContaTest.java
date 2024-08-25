package com.example;
//Espiando objetos

import net.bytebuddy.asm.MemberSubstitution;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
public class ContaTest {

    @Spy
    private Conta conta = new Conta(1_000);

    @Test
    void validarOrdemDeChamadas(){

        conta.pagaBoleto(300);

        InOrder inOrder = Mockito.inOrder(conta); // espiando se o objeto esta caminhando pela ordem esperada
        inOrder.verify(conta).pagaBoleto(300);
        inOrder.verify(conta).validaSaldo(300);
        inOrder.verify(conta).debita(300);
        inOrder.verify(conta).enviaCreditoParaEmissor(300);
    }

    @Test
    void validarQuantidadeDeVezesQueMetodosFoiChamado(){

        conta.validaSaldo(300);
        conta.validaSaldo(500);
        conta.validaSaldo(600);

        Mockito.verify( conta, Mockito.times(3)).validaSaldo(anyInt()); // valida quantas vezes o metodo foi chamado
        //ArgumentMatchers.anyInt() -  verificar se um método foi chamado com qualquer valor para um argumento específico
    }

    @Test
    void retornaTrueParaQualquerValorNaValidacaoDeSaldo(){
        Mockito.doNothing().when(conta).validaSaldo(anyInt());
        conta.validaSaldo(3_500);

    }
}
