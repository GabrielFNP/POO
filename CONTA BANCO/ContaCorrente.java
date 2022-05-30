package POO;
public class ContaCorrente extends conta {

	public ContaCorrente(int numero, String nome, double saldo, boolean situacao) {
        super(numero, nome, saldo, situacao);
       
    }

    public void tipoConta(int numero, String nome, double saldo, boolean situacao) {
		
	}
	
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false; 
        }
     }

     public boolean transferir(double valor, conta conta) {
        if (this.sacar(valor)) {
            conta.sacar(valor);
            return true;
        } else {
            return false;
        }
  }

}