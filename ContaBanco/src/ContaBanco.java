import java.util.Locale;
import java.util.Scanner;
public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Cliente cliente = new Cliente();

        System.out.println("Seja Bem Vindo!!");

        System.out.println("Insira seu nome: ");
        cliente.nome = scanner.next();

        System.out.println("Insira o numero da sua conta: ");
        cliente.conta = scanner.nextInt();

        System.out.println("Insira o numero da agencia (000-0): ");
        cliente.agencia = scanner.next();

        System.out.println("Agora insira o valor do depósito: ");
        cliente.saldo = scanner.nextDouble();

        cliente.apresentarCliente();
    }
        
       
}
