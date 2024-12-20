public class Main {
    public static void main(String[] args) {

        Cliente cainan = new Cliente();
        cainan.setNome("Cainan");

        Conta cc =  ContaCorrente.builder().numero(1223).saldo(200).agencia(3456).cliente(cainan).build();
        Conta cp =  ContaPoupanca.builder().numero(1224).saldo(200).agencia(3455).cliente(cainan).build();

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
