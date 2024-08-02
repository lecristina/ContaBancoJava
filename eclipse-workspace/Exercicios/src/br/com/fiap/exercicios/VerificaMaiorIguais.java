package br.com.fiap.exercicios;

import java.util.Scanner;

public class VerificaMaiorIguais {

	public static void main(String[] args) {
		// Peça ao usuário para inserir dois números inteiros.
		//Compare os números e imprima uma mensagem indicando 
		//se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

		Scanner scan = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		
		System.out.println("Digite o primeiro número: ");
		numero1 =scan.nextInt();
		System.out.println("Digite o segundo número:");
		numero2 = scan.nextInt();
		
		if (numero1 == numero2) {
			System.out.println("São iguais");
		}else if(numero1 != numero2 && numero1 > numero2) { 
			System.out.println("São diferentes");
			System.out.println("O número " + numero1 + "\né maior que o " + numero2);
		}else if (numero1 != numero2 && numero1 < numero2) {
			System.out.println("São diferentes");
			System.out.println("O número: " + numero2 + "\né maior que o " + numero1);
		} else {
			System.out.println("ERRO");
		}
		
		
		
	}

}

//ouuuuuuuuuuuuuuu

/*
 import java.util.Scanner;

public class Comparacao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }
    }
}
*/
