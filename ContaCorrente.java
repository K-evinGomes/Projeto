package ProjetoBanco;

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("\n" + "=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}