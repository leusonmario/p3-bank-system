package basico;

import basico.exception.SaldoInvalidoException;

public abstract class ContaCorrente extends ContaGeral{

  public ContaCorrente(int numero) {
    super(numero);
  }
  public abstract void depositar(float valor);

  public boolean sacar(float valor) throws SaldoInvalidoException {
    if(this.saldo >= valor){
      this.setSaldo(this.saldo-valor);
      return true;
    }
    throw new SaldoInvalidoException(getNumero(), getSaldo());
  }
}
