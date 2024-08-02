package br.com.fiap.exercicios;

import java.util.Scanner;

public class Concatenacao {

	public static void main(String[] args) {
		//Declare uma variável do tipo char (letra) e uma variável do tipo
		//String (palavra). Atribua valores a essas variáveis
		//e concatene-as em uma mensagem.

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		char letra = scan.next().charAt(0);
		System.out.println("Digite uma palavra: ");
		String palavra = scan.next();
		
		System.out.println(letra + palavra);
		scan.close();
		
		
	}

}

/*
 *public class Palavras{
    public static void main(String[] args) {
        char letra = 'A';
        String palavra = "MARELO";

        String mensagem = "A letra é " + letra + " e a palavra é " + palavra;

        System.out.println(mensagem);
    }
}
 */
 