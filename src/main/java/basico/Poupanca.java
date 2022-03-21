package basico;

public class Poupanca extends ContaCorrente{
  private float juros;

  public Poupanca (int numero) {
    super(numero);
    this.juros = (float) 0.01;
  }

  public Poupanca (int numero, float juros) {
    super(numero);
    this.juros = juros;
  }

  public void renderJuros(){
    this.saldo += (this.saldo * this.juros);
  }

  public void depositar(float valor) {
    this.setSaldo(this.saldo + valor);
  }

}
