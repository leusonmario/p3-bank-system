package basico;

public class ContaBonificada extends ContaCorrente{
  private float bonus;

  public ContaBonificada(int numero) {
    super(numero);
    this.bonus = 0;
  }

  @Override
  public void depositar(float valor){
    this.setSaldo(this.saldo+valor);
    this.creditarBonus(valor);
  }

  private void creditarBonus(float valor){
    this.bonus += (valor*0.01);
  }

  public void renderBonus(){
    this.depositar(this.bonus);
    this.bonus = 0;
  }
}
