package basico.banco;

import basico.ContaBonificada;
import basico.ContaGeral;
import basico.ContaPG;
import basico.Poupanca;
import java.util.ArrayList;

public class Banco implements BancoInterface{

	private ArrayList<ContaGeral> contas;
	private int contadorDeContas;
	
	public Banco() {
		contas = new ArrayList<ContaGeral>();
		contadorDeContas = 0;
	}
	
	public boolean criarConta(int numero) {
		ContaGeral conta = new ContaBonificada(numero);
		contas.add(conta);
		contadorDeContas++;
		return true;
	}

	public boolean criarPoupanca(int numero) {
		ContaGeral conta = new Poupanca(numero);
		contas.add(conta);
		contadorDeContas++;
		return true;
	}

	public boolean criarContaPG(int numero) {
		ContaGeral conta = new ContaPG(numero);
		contas.add(conta);
		contadorDeContas++;
		return true;
	}
	
	public boolean depositar(int numero, float valor) {
		for(ContaGeral conta: this.contas){
			if (conta.getNumero() == numero){
				conta.depositar(valor);
				return true;
			}
		}
		return false;
	}
	
	public boolean sacar(int numero, float valor) {
		for(ContaGeral conta: this.contas){
			if (conta.getNumero() == numero){
				return conta.sacar(valor);
			}
		}
		return false;
	}

	public boolean renderJuros(int numConta) {
		for(ContaGeral conta: this.contas){
			if (conta.getNumero() == numConta && conta instanceof Poupanca){
				((Poupanca) conta).renderJuros();
				return true;
			}
		}
		return false;
	}

	public void removerConta(int numConta){
		for(ContaGeral conta: this.contas){
			if(conta.getNumero() == numConta){
				this.contas.remove(conta);
				this.contadorDeContas--;
			}
		}
	}

	public ArrayList<ContaGeral> getContas() {
		return contas;
	}

	@Override
	public float getSaldoContas() {
		float saldoContas = 0;
		for(ContaGeral contaGeral: this.contas){
			saldoContas += contaGeral.getSaldo();
		}
		return saldoContas;
	}

	@Override
	public int getNumeroContas() {
		return this.contas.size();
	}
}
