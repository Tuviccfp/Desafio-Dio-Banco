package org.example.interfaces;

import org.example.entities.Conta;

public interface MethodsConta {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, MethodsConta destino);
    void imprimirExtrato();
}
