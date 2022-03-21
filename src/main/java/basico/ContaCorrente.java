package basico;

public abstract class ContaCorrente extends ContaGeral{

  public ContaCorrente(int numero) {
    super(numero);
  }
  public abstract void depositar(float valor);

  public boolean sacar(float valor){
    if(this.saldo >= valor){
      this.setSaldo(this.saldo-valor);
      return true;
    }
    return false;
  }
}
