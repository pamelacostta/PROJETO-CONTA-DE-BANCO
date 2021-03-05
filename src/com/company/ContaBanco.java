package com.company;

public class ContaBanco {
    public int numeroConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("-----------------------------------------");
        System.out.println("Conta: " + getNumeroConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.printf("Saldo: R$ %.3f%n ", getSaldo());
        System.out.println("Status: " + getStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem débitos");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(double v) {
        if (this.getStatus()) {
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de ! " + getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada! ");
        }
    }

    public void sacar(double v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Slado insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }


    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }
}