package com.exemplo;

import java.sql.SQLOutput;

public class Conta {
    private int numeroConta;
    private double saldo;

    public Conta(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public double consultarSaldo(){
        return saldo;
    }
    public void exibirInformacoes(){
        System.out.println("NÚMERO DA CONTA: "+ numeroConta);
        System.out.println("SALDO: R$"+ saldo);
    }
}
