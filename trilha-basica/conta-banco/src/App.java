import java.util.Scanner;
import entities.ContaBanco;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da conta :");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o numero da Agencia :");
        String agency = sc.nextLine();
        System.out.println("Digite o nome do Cliente");
        String clientName = sc.nextLine();
        System.out.println("Qual o saldo inicial?");
        Double amount = sc.nextDouble();

        ContaBanco conta = new ContaBanco(number, agency, clientName, amount);

        System.out.print("Olá " + conta.getClientName() + " , obrigado por criar uma conta em nosso banco !");
        System.out.println(" sua agência é " + conta.getAgency() + " conta : " + conta.getNumber());
        System.out.printf("E seu saldo atual é R$ : %.2f", conta.getBalance());
 
        sc.close();
    }
}
