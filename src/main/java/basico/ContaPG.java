package basico;

public class ContaPG extends ContaGeral{

  public ContaPG(int numero) {
    super(numero);
  }

  public void depositar(float valor){
    this.saldo += (valor - valor*0.01);
  }

  public boolean sacar(float valor) {
    if ((valor + valor*0.01) <= this.saldo){
      this.saldo -= (valor + valor*0.01);
      return true;
    }
    return false;
  }
}
