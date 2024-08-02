package br.com.fiap.exercicios;

import java.util.Scanner;

public class Casting {

	public static void main(String[] args) {
		// Declare uma variável do tipo double e uma variável do tipo 
		//int. Faça o casting da variável double para int e imprima o resultado.

		double num = 3.8;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número decial(ex:3.7): ");
		int casting = (int)num;
		
		System.out.println("Conversão do casting no final: " + casting);
		scan.close();
	}

}

/*public class Casting{
public static void main(String[] args) {
double numeroDouble = 15.7;
int numeroInteiro = (int) numeroDouble;
System.out.println("Casting de double para int: " + numeroInteiro);
}
}
*/