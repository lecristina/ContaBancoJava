package br.com.fiap.exercicios;

import java.util.Scanner;

public class NumeroPositivo {
	//Crie um programa que solicite ao usuário digitar um número.
	//Se o número for positivo, exiba "Número positivo",
	//caso contrário, exiba "Número negativo".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}
