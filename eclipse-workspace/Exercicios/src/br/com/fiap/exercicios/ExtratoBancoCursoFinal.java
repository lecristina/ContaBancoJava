package br.com.fiap.exercicios;

import java.util.Scanner;

public class ExtratoBancoCursoFinal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nome = "Leticia Cristina";
		String tipoConta = "Corrente";
		System.out.println("Digite seu saldo: ");
		double saldoInicial = scan.nextDouble();
		String mensagens = "1- Consultar saldos "
				+ "\n2- Receber valor "
				+ "\n3- Transferir valor "
				+ "\n4- Sair\n "
				+ "\nDigite a opção desejada";
		int escolha = 0;


		System.out.println("*********************************");
		System.out.println("Dados iniciais do cliente:\n" 
				+ "\nNome: " + nome 
				+ "\nTipo conta: " + tipoConta 
				+ "\nSaldo inicial: " + saldoInicial);
		System.out.println("*********************************");

		while (escolha != 4) {
			System.out.println("Operações\n");
			System.out.println(mensagens);
			escolha = scan.nextInt();


			switch (escolha) {
			case 1: {

				System.out.println("O saldo atual é R$ " + saldoInicial);
				break;	
			}case 2: {

				System.out.println("Informe o valor a receber: ");
				double valorReceber = scan.nextDouble(); 
				saldoInicial += valorReceber;
				System.out.println("Saldo atualizado R$ " + saldoInicial);
				break;
			}case 3: {

				System.out.println("Informe o valor que deseja transferir: ");
				double transferirValor = scan.nextDouble(); 

				if (transferirValor <= saldoInicial) {
					saldoInicial -= transferirValor;
					System.out.println("Saldo atualizado R$ " + saldoInicial);
				}else {
					System.out.println("Saldo insuficiente, não foi possível realizar a transferência");
				}
				break;
			}case 4:{
				System.out.println("Obrigada");
				break;
			}default:
				System.out.println("Opção inválida");


		}

	}


	}
}

