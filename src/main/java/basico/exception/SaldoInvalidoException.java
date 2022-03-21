package basico.exception;

public class SaldoInvalidoException extends Exception{
  int numConta;
  double saldo;
  public SaldoInvalidoException(int numConta, double saldo){
    super("Saldo insuficiente!!");
    this.numConta = numConta;
    this.saldo = saldo;
  }
  
}
