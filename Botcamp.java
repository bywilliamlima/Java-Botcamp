import java.util.Scanner;

public class Botcamp {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        String Nome;
        int NumeroAgencia, NumeroConta;
        double Saldo;

        Saldo = 237.48;

        System.out.println("Digite seu nome:");
        Nome = scanner.nextLine();
        System.out.println("Digite o número da sua agência:");
        NumeroAgencia = scanner.nextInt();
        System.out.println("Digite o número da sua conta:");
        NumeroConta = scanner.nextInt();

        System.out.println(
                "Olá "+Nome+" obrigado por criar uma conta em nosso banco, sua agência é: "+ NumeroAgencia+" conta: " + NumeroConta+" e seu saldo "+ Saldo+" já está disponível para saque\".");

    }
}
