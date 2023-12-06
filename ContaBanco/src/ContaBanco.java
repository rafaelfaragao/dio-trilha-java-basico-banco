import java.util.Scanner;
public class ContaBanco {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Bom dia, por favor digite seu nome: ");
            String nomeCliente = s.nextLine();

            System.out.println("Por favor, digite o número da agência: ");
            String agenciaConta = s.nextLine();

            System.out.println("Por favor digite o número da conta: ");
            int numeroConta = s.nextInt();

            System.out.println("Digite o saldo inicial R$: ");
            double saldoConta = s.nextDouble();

            System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agenciaConta + ", conta " + 
            numeroConta + " e seu saldo é R$" + String.format("%.2f", saldoConta) + " já está disponível para saque." );
        }
    }
}
