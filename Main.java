package ProjetoBanco;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Carla");
        cliente.setCpf(49895806809L);

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(100d);
        cc.transferir(100d, poupanca);

        cc.extrato();
        poupanca.extrato();

    }
}