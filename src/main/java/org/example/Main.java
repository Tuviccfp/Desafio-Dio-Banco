package org.example;

import org.example.entities.Cliente;
import org.example.entities.Conta;
import org.example.entities.ContaCorrente;
import org.example.entities.ContaPoupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente client = new Cliente("Nelsons");

        Conta cc = new ContaCorrente(client);
        Conta poupanca = new ContaPoupanca(client);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}