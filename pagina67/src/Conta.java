public class Conta {
    protected int numero;         // Número da conta
    protected String nomeTitular; // Nome do titular da conta
    protected double saldo;       // Saldo da conta

    // Construtor da classe Conta
    public Conta(int numero, String nomeTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // Método para sacar
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    // Getter para o saldo
    public double getSaldo() {
        return saldo;
    }

    // Getter e Setter para o nome do titular
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}
