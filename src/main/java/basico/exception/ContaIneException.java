package basico.exception;

public class ContaIneException extends Exception {
    public ContaIneException(){
        super("Esta conta não existe!");
    }
}
