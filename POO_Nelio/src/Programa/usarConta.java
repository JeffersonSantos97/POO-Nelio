package Programa;

import java.util.Scanner;

import entidades.Conta;

public class usarConta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Conta conta = null; // tive que inicializar o objeto pra ele funcionar no meu retorno do toString
		//                  pq eu coloquei o objeto pra inicializar dentro de um do {}while 

		System.out.print("Entre com o numero: ");
		int numero = sc.nextInt();
		
		sc.nextLine(); // quebrar a linha quando um int está em cima // se não não pega o next de baixo 

		System.out.print("Entre com o nome: ");
		String nome = sc.nextLine();
		
		boolean teste = true; // pra saber se vai continuar ou não perguntando enquanto colocar a letra errada 

		// fazer enquanto teste for true
		do {

			System.out.print("Vai entrar com deposito Inicial [ y / n ] ? ");
			char resposta = sc.next().charAt(0);

			if (resposta == 'y' || resposta == 'Y') {

				System.out.println("Entre com um deposito Inicial: ");
				double depositoInicial = sc.nextDouble();

				conta = new Conta(numero, nome, depositoInicial); // objeto receber o numero / nome / saldo ( deposito inicial )

				teste = false; // sai do DO {} while pq era [ y ou n ]
			} else if (resposta == 'n' || resposta == 'N') {
				conta = new Conta(numero, nome); // objeto retornar o numero e o nome, pois o cliente não entrou com o deposito inicial  
				teste = false; // sai do DO {} while pq era [ y ou n ]
			
			} else {

				System.out.println(" Resposta inválida, tente novamente: ");
				teste = true; // continua no do {} while pq a letra digitada está errada 
			}
		} while (teste == true);
		
		System.out.println("Dados do Banco: ");
		System.out.println(conta); // retorna o toString
		
		System.out.print("Entre com um depósito: ");
		double valor = sc.nextDouble();
		
		conta.depositar(valor); // pega o metodo adicionar e adicona a variavel  valor 
		System.out.println("Reajuste do saldo da conta: ");
		System.out.println(conta); // retorna toString
		
		System.out.println("Entre com um saque: ");
		valor = sc.nextDouble();
		
		conta.sacar(valor);
		
		System.out.println("Reajuste do saldo da conta: ");
		System.out.println(conta);
		
		
		

		sc.close();
	}

}
