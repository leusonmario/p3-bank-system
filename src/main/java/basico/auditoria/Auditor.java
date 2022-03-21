package basico.auditoria;

import basico.banco.BancoInterface;

public class Auditor {

  public boolean verificaInvestimentos(BancoInterface banco){
    if (banco.getSaldoContas() / banco.getNumeroContas() >= 500){
      return true;
    }else{
      return false;
    }
  }

}
