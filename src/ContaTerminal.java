import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        double saldo = 530;

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta ! ");
        int numeroConta = entrada.nextInt();

        System.out.println("Por favor, digite o número a Agência ! ");
        String agencia = entrada.next();

        System.out.println("Por favor, digite seu nome ! ");
        String nomeCliente = entrada.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+ agencia +", conta " + numeroConta + " e seu saldo de "+ saldo +" já está disponível para saque");
    }
}
