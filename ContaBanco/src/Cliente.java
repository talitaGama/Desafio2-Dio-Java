public class Cliente{
String nome;
int conta;
String agencia;
double saldo;

    void apresentarCliente() {
    System.out.println("Olá " + nome);
    System.out.println("Agência: " + agencia);
    System.out.println("Conta: " + conta);
    System.out.println("Saldo disponível pra saque: R$" + saldo);

    }

    void Saque(double valorSaque){
        if(valorSaque>saldo){
            System.out.println("Saldo insulficiente!");
        }else{
            saldo = saldo-valorSaque;
        }

    }
}