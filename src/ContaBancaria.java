import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {

        int numeroConta;
        String numeroAgencia;
        String nomeCliente ;
        double saldoConta;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da conta: ");
        numeroConta =scanner.nextInt();

        System.out.println("Por favor, digite o numero da agencia: ");
        numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        scanner.nextLine();
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        saldoConta = scanner.nextDouble();

        System.out.println("\nOla, Obrigado "+ nomeCliente + " por criar uma conta em nossa banco. \nO numero de sua agencia é "+ numeroAgencia+ ", numero da conta é " + numeroConta +" com  o saldo de " + saldoConta + " reais!");


    }
}
