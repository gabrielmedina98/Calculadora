package com.company;

public class Main {

    public static void main(String[] args) {
        //calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(9, 4);
        Calculadora.multiplicacao(10, 2);

        //Mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(21);
//Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(100, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(100, Emprestimo.getTresParcelas());
        Emprestimo.calcular(100,5);



    }

}