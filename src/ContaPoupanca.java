import lombok.Builder;

public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato(){
        System.out.println("--- Extrato Conta Poupança ---");
        super.imprimirInfosComuns();
    }

    @Builder
    public ContaPoupanca(int agencia, int numero, double saldo, Cliente cliente){
        super(agencia, numero, saldo, cliente);
    }

}
