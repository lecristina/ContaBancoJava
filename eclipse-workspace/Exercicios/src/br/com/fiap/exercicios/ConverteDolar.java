package br.com.fiap.exercicios;

import java.util.Scanner;

public class ConverteDolar {

	public static void main(String[] args) {
		//Declare uma variável do tipo double valorEmDolares. 
		//Atribua um valor em dólares a essa variável. Considere 
		//que o valor de 1 dólar é equivalente a 4.94 reais. Realize 
		//a conversão do valor em dólares para reais e imprima o resultado formatado.

		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva um valor em dólar: ");
		double valorEmDolar = scan.nextDouble();
		double conversor = valorEmDolar * 4.94;
		System.out.println(String.format("O valor convertido em reais fica: %.2f", conversor));
		scan.close();
	}

}


//
/*
 * public class ConversaoDolaresReais {
    public static void main(String[] args) {
        double valorEmDolares = 100.50;
        double taxaDeConversao = 4.94;

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println("O valor em reais é: " + valorEmReais);
    }
}

 */