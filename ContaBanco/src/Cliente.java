public class Cliente{
String nome;
int conta;
String agencia;
double saldo;

void apresentarCliente() {
    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco!");
    System.out.println("Agência: " + agencia);
    System.out.println("Conta: " + conta);
    System.out.println("Saldo: R$" + saldo);

    }
}