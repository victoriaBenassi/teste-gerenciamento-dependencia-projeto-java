package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.mockito.Mockito;

import java.util.List;

@ExtendWith(MockitoExtension.class) //forma padrão para começar a usar o mockito
public class ListaTest {

    @Mock
    private List<String> letras;

    @Test
    void  adicionarItemNaLista(){
        Mockito.when(letras.get(0)).thenReturn("B");

        Assertions.assertEquals("B", letras.get(0));

    }
}
