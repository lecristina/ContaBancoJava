package br.com.fiap.exercicios;

import java.util.Scanner;

public class MediaNota {

	public static void main(String[] args) {

		//Crie um programa que realize a média de duas notas decimais e exiba o resultado.
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite o valor da segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double calculaMedia = (nota1 + nota2)/2;

		System.out.println(String.format("Sua média é: %.2f", calculaMedia));
		scan.close();
		
	}

}

/*
public class Media{
public static void main(String[] args) {
    double nota1 = 8.9;
    double nota2 = 7.5;
    double media = (nota1 + nota2) / 2;

    System.out.println("Média: " + media);
}
}
*/