package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {

    @Mock
    private ApiDosCorreios apiDosCorreios ;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa; //injetando o mock da apiDosCOrreios na classe CadastrarPessoa

    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG","Patos de Minas", "rua 2","apartamento","centro");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("99288")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("victoria", "9999999", LocalDate.now(), "99288");


        assertEquals("victoria", pessoa.getNome());
        assertEquals("9999999", pessoa.getDocumento());
        assertEquals("MG", pessoa.getEndereco().getUf());
        assertEquals("Patos de Minas", pessoa.getEndereco().getCidade());
        assertEquals("rua 2", pessoa.getEndereco().getLogradouro());


    }
}
