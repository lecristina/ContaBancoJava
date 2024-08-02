package br.com.fiap.exercicios;

public class Fatorial {

	public static void main(String[] args) {
		// Crie um programa que solicite ao usuário
		//um número e calcule o fatorial desse número.
		
			int i,fact = 1;
			int number = 7;// our number to do the necessary calculations in class Factorial
			for(i=1;i<=number;i++){
				fact=fact*i;
			}
			System.out.println("Factorial of "+number+" is: "+fact);
		 	}

}
