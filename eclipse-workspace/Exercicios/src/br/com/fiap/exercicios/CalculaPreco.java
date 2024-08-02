package br.com.fiap.exercicios;

import java.util.Scanner;

public class CalculaPreco {

	public static void main(String[] args) {
		//Declare uma variável do tipo double 
		//precoProduto e uma variável do tipo int 
		//(quantidade). Calcule o valor total multiplicando 
		//o preço do produto pela quantidade e apresente o resultado em uma mensagem.

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o preço do produto: ");
		double precoProduto = scan.nextDouble();
		System.out.println("Quantidade do produto: ");
		int quantidade = scan.nextInt();
		double total = precoProduto * quantidade;
		
		System.out.println(total);
		scan.close();
		
	}

}

//ouuuuuuuu
/*
 * public class Produto{
    public static void main(String[] args) {
        double precoProduto = 29.99;
        int quantidade = 3;

        double total = precoProduto * quantidade;

        String mensagem = "O valor total da compra é R$" + total;

        System.out.println(mensagem);
    }
}
*/
