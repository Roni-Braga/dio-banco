import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o número da agencia:");
        String agencia = sc.next();

        System.out.println("Por favor, digite o nome do cliente:");
        String cliente = sc.next();

        System.out.println("Por favor, digite o saldo da conta:");
        Double saldo = sc.nextDouble();

        System.out.println(
                "Olá" + cliente + "obrigado por criar uma conta em nosso banco, sua agência é" + agencia + ", conta"
                        + numero + " e seu saldo" + saldo + "já está disonível para saque");

    }
}
