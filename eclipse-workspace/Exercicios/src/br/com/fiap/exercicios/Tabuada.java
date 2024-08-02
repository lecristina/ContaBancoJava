package br.com.fiap.exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// Crie um programa que solicite ao usuário um número 
		// e exiba a tabuada desse número de 1 a 10.

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número: ");
		        int numero = scanner.nextInt();

		        System.out.println("Tabuada do " + numero + ":");
		        for (int i = 1; i <= 10; i++) {
		            System.out.println(numero + " x " + i + " = " + (numero * i));
		        }
		    }
		}

		
		
		
		
		
		
		
		
		/*	
		Scanner scan = new Scanner(System.in);
		
		int tabuada = 0;
		
		System.out.println("Digite o número da tabuada que você quer ver: ");
		tabuada = scan.nextInt();
		
		switch (tabuada) {
		case 1: {
			
			System.out.println("""
							1 x 1 = 1
							1 x 2 = 2
							1 x 3 = 3
							1 x 4 = 4
							1 x 5 = 5
							1 x 6 = 6
							1 x 7 = 7
							1 x 8 = 8
							1 x 9 = 9
							1 x 10 = 10
							""");
			break;
		}case 2: {
			
			System.out.println("""
							2 x 1 = 2
							2 x 2 = 4
							2 x 3 = 6
							2 x 4 = 8
							2 x 5 = 10
							2 x 6 = 12
							2 x 7 = 14
							2 x 8 = 16
							2 x 9 = 18
							2 x 10 = 20
							""");
			break;	
		}case 3: {
			
			System.out.println("""
							3 x 1 = 3
							3 x 2 = 6
							3 x 3 = 9
							3 x 4 = 12
							3 x 5 = 15
							3 x 6 = 18
							3 x 7 = 21
							3 x 8 = 24
							3 x 9 = 27
							3 x 10 = 30
							""");
			break;
		}case 4: {
			
			System.out.println("""
							4 x 1 = 4
							4 x 2 = 8
							4 x 3 = 12
							4 x 4 = 16
							4 x 5 = 20
							4 x 6 = 24
							4 x 7 = 28
							4 x 8 = 32
							4 x 9 = 36
							4 x 10 = 40
							""");
			break;
		}case 5: {
			
			System.out.println("""
							5 x 1 = 5
							5 x 2 = 10
							5 x 3 = 15
							5 x 4 = 10
							5 x 5 = 25
							5 x 6 = 30
							5 x 7 = 35
							5 x 8 = 40
							5 x 9 = 45
							5 x 10 = 50
							""");
			break;
		}case 6: {
			
			System.out.println("""
							6 x 1 = 6
							6 x 2 = 12
							6 x 3 = 18
							6 x 4 = 24
							6 x 5 = 30
							6 x 6 = 36
							6 x 7 = 42
							6 x 8 = 48
							6 x 9 = 54
							6 x 10 = 60
							""");
			break;
		}case 7: {
			
			System.out.println("""
							7 x 1 = 7
							7 x 2 = 14
							7 x 3 = 21
							7 x 4 = 28
							7 x 5 = 35
							7 x 6 = 42
							7 x 7 = 49
							7 x 8 = 56
							7 x 9 = 63
							7 x 10 = 70
							""");
			break;
		}case 8: {
			
			System.out.println("""
							8 x 1 = 8
							8 x 2 = 16
							8 x 3 = 24
							8 x 4 = 32
							8 x 5 = 40
							8 x 6 = 48
							8 x 7 = 56
							8 x 8 = 64
							8 x 9 = 72
							8 x 10 = 80
							""");
			break;
		}case 9: {
			
			System.out.println("""
							9 x 1 = 9
							9 x 2 = 18
							9 x 3 = 27
							9 x 4 = 36
							9 x 5 = 45
							9 x 6 = 54
							9 x 7 = 63
							9 x 8 = 72
							9 x 9 = 81
							9 x 10 = 90
							""");
			break;
		}case 10: {
			
			System.out.println("""
							10 x 1 = 10
							10 x 2 = 20
							10 x 3 = 30
							10 x 4 = 40
							10 x 5 = 50
							10 x 6 = 60
							10 x 7 = 70
							10 x 8 = 80
							10 x 9 = 90
							10 x 10 = 100
							""");
			break;
		}	
		}
	}
}
*/
