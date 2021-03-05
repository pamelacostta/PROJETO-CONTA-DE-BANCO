package com.company;

public class Dados {
    public static void main(String[] args) {
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumeroConta(321456);
        pessoa1.setDono("Pâmela da Palma Costa");
        pessoa1.abrirConta("CC");

        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumeroConta(123654);
        pessoa2.setDono("José Luís de Souza");
        pessoa2.abrirConta("CP");

        pessoa1.depositar(200);
        pessoa2.depositar(500);
        pessoa2.sacar(300);

        pessoa1.estadoAtual();
        pessoa2.estadoAtual();
    }
}