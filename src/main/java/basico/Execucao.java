package basico;

import basico.banco.Banco;
import basico.exception.ContaIneException;
import basico.exception.SaldoInvalidoException;
import java.util.Scanner;

public class Execucao {

	static Scanner s  = new Scanner(System.in);
	
	public static void main(String[] args) throws SaldoInvalidoException, ContaIneException {
		Banco b = new Banco();
		int escolha, numConta;
		float valor;
		do {
			System.out.println("digite o que deseja");
			System.out.println("1 - abrir uma conta");
			System.out.println("2 - abrir uma poupança");
			System.out.println("3 - abrir uma conta PG");
			System.out.println("4 - realizar deposito em conta ");
			System.out.println("5 - realizar saque em conta ");
			System.out.println("6 - render juros ");
			System.out.println("7 - sair ");
			escolha = s.nextInt();
			switch (escolha) {
				case 1: {
					System.out.println("digite numero da conta");
					numConta = s.nextInt();
					b.criarConta(numConta);
					break;
				}
				case 2: {
					System.out.println("digite numero da conta");
					numConta = s.nextInt();
					b.criarPoupanca(numConta);
					break;
				}
				case 3: {
					System.out.println("digite numero da conta");
					numConta = s.nextInt();
					b.criarContaPG(numConta);
					break;
				}
				case 4: {
					System.out.println("digite numero da conta");
					numConta = s.nextInt();
					System.out.println("digite o valor");
					valor = s.nextFloat();
					boolean depositoRealizado = b.depositar(numConta, valor);
					System.out.println("Deposito realizado: " + depositoRealizado);
					break;
				}
				case 5: {
					System.out.println("digite numero da conta");
					numConta = s.nextInt();
					System.out.println("digite o valor");
					valor = s.nextFloat();
					try{
						boolean saqueRealizado = b.sacar(numConta, valor);
						System.out.println("Saque realizado: " + saqueRealizado);
					}catch (SaldoInvalidoException saldoInvalidoException){
						System.out.println(saldoInvalidoException.getMessage());
					}finally {
						System.out.println("Uma operação foi realizada");
					}
					break;
				}
				case 6: {
					System.out.println("digite numero da conta");
					numConta = s.nextInt();
					boolean renderJuros = b.renderJuros(numConta);
					System.out.println("Render Juros: " + renderJuros);
					break;
				}
				default:
					System.out.println("Opcao invalida");
					break;
				}
		} while (escolha != 7);
	}
}
