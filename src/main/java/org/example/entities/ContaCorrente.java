package org.example.entities;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Saldo Conta Corrente ---");
        super.imprimirExtrato();
    }
}
