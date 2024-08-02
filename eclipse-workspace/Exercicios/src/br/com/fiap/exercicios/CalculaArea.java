package br.com.fiap.exercicios;

import java.util.Scanner;

public class CalculaArea {

	public static void main(String[] args) {
		// Crie um menu que oferece duas opções ao usuário: 
		// "1. Calcular área do quadrado" e 
		// "2. Calcular área do círculo". 
		// Solicite a escolha do usuário e realize o 
		// cálculo da área com base na opção selecionada.
		
		Scanner scan = new Scanner(System.in);
		
		int forma = 0;
		double pi = 3.1416;
		
		System.out.println("Digite 1 para calcula área do quadrado e 2 para calcular do círculo");
		forma = scan.nextInt();
		
		if (forma == 1) {
			System.out.println("Você escolheu quadrado");
			System.out.println("Digite o valor da base: ");
			double base1 = scan.nextDouble();
			System.out.println("Digite o valor da altura: ");
			double altura1 = scan.nextDouble();
			
			double areaQuadrado = base1 * altura1;
			System.out.println("A área do quadrado é: " + areaQuadrado);
			
		}else if (forma == 2) {
			System.out.println("Você escolheu círculo");
			System.out.println("Digite o valor do raio: ");
			double raio = scan.nextDouble();
			
			double areaCirculo = pi * raio * raio;
			System.out.println("A área do círculo é: " + areaCirculo);
		}

	}

}

/*
 * import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio; 
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
*/
