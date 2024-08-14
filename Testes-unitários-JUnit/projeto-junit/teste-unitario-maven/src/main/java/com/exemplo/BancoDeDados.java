package com.exemplo;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        //fez algo
        LOGGER.info("Iniciou conexão");
    }
    public static void finalizarConexao(){
        //fez algo
        LOGGER.info("Finalizou conexão");
    }
    public static void inserirDados(Pessoa pessoa){
        //insere pessoa no DB
        LOGGER.info("Inseriu dados");
    }
    public static void removeDados(Pessoa pessoa){
        //remove pessoa no DB
        LOGGER.info("removeu dados");
    }
}
