package basico;

import basico.exception.SaldoInvalidoException;

public abstract class ContaGeral {

	protected int numero;
	protected float saldo;
	
	public ContaGeral (int numero) {
		this.numero = numero;
		this.saldo = 0;
	}

	public abstract boolean sacar(float valor) throws SaldoInvalidoException;

	public abstract void depositar(float valor);

	public int getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float novoSaldo) {
		saldo = novoSaldo;
	}
}
