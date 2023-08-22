import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Número conta");
        String numeroConta = scanner.nextLine();

        System.out.println("Saldo");
        int saldo = scanner.nextInt();

        scanner.close();

        System.out.println("Olá " + nome + ",obrigado por criar uma conta em nosso banco,sua agência é " + numeroAgencia + ",conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque");
    }
}