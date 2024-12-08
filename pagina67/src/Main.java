public class Main {
    public static void main(String[] args) {
        // Testando ContaEspecial
        ContaEspecial contaEspecial = new ContaEspecial(1, "João", 500.0);
        contaEspecial.depositar(1000.0);
        System.out.println("Saldo antes do saque (Conta Especial): " + contaEspecial.getSaldo());
        if (contaEspecial.sacar(1200.0)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saque não realizado.");
        }
        System.out.println("Saldo após o saque (Conta Especial): " + contaEspecial.getSaldo());

        // Testando ContaPoupanca
        ContaPoupanca contaPoupanca = new ContaPoupanca(2, "Maria");
        contaPoupanca.depositar(2000.0);
        System.out.println("Saldo antes do reajuste (Conta Poupança): " + contaPoupanca.getSaldo());
        contaPoupanca.reajustar(0.05); // Reajuste de 5%
        System.out.println("Saldo após o reajuste (Conta Poupança): " + contaPoupanca.getSaldo());
    }
}
