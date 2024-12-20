import lombok.Builder;

public class ContaCorrente extends Conta{
    @Override
    public void imprimirExtrato(){
        System.out.println("--- Extrato Conta Corrente ---");
        super.imprimirInfosComuns();
    }

    @Builder
    public ContaCorrente(int agencia, int numero, double saldo, Cliente cliente){
        super(agencia, numero, saldo, cliente);
    }
}
