import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        var scanner = new Scanner(System.in);
        System.out.print("Por favor, Insira o número da conta: ");
        var numConta = scanner.nextInt();
        System.out.print("Por favor, Insira o número da agência: ");
        var numAgencia = scanner.next();
        System.out.print("Por favor, Insira seu nome: ");
        var nome = scanner.next();
        System.out.print("Por favor, Insira o saldo que deseja sacar: ");
        var saldo = scanner.nextFloat();

        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia +
        ", conta " + numConta + " e seu saldo R$" + saldo + " já esta disponível para saque.");

        scanner.close();
    }
}
