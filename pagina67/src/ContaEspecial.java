public class ContaEspecial extends Conta {
    private double limite; // Limite adicional da conta especial

    // Construtor da classe ContaEspecial
    public ContaEspecial(int numero, String nomeTitular, double limite) {
        super(numero, nomeTitular);
        this.limite = limite;
    }

    // Getter e Setter para o limite
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Sobrescrita do método sacar
    @Override
    public boolean sacar(double valor) {
        if (valor <= this.limite + this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
