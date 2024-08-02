package br.com.fiap.exercicios;

import java.util.Random;
import java.util.Scanner;

public class AdvinhaNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numeroAleatorio = new Random().nextInt(100);
		int numeroChutado = 0;
		int numeroTentativas = 0;
		
		
		while (numeroTentativas < 5) {
			System.out.println("Digite o seu chute: ");
			numeroChutado = scan.nextInt();
			numeroTentativas++;
			
			if (numeroChutado < numeroAleatorio) {
				System.out.println("O número é maior que esse");
				
			}else if (numeroChutado > numeroAleatorio) {
				System.out.println("O número é menor que esse");
				
			}else if (numeroChutado == numeroAleatorio) {
				System.out.println("Você acertou! Seu número de chutes foi de: " + numeroTentativas);
				break;
			}
				
		}
		
		if(numeroTentativas == 5 && numeroChutado != numeroAleatorio) {
			System.out.println("Você não conseguiu acertar o número em 5 tentativas. O número era: " + numeroAleatorio);
			
		}
		
	}

}
//ouuuuuuuuuuuuuuuuuuuuuuuuuuuuuu

/*
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;
        int numeroDigitado = 0;
        
        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;
            
            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; // interrompe o loop while
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
             System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
    }
}
*/