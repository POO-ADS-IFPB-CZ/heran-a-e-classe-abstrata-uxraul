public class ContaPoupanca extends Conta {

    // Construtor da classe ContaPoupanca
    public ContaPoupanca(int numero, String nomeTitular) {
        super(numero, nomeTitular);
    }

    // Método para reajustar o saldo com base em um percentual
    public void reajustar(double percentual) {
        saldo = saldo + saldo * percentual;
    }
}
