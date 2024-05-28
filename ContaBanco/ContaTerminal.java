import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Bem Vindo ao Banco JPS");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println();
        String Agencia = "";
        int Numero_Conta = 0;
        String Nome_Cliente = "";
        double saldo = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por Favor, digite o Número da agência: ");
        Agencia = scanner.nextLine();
        // System.out.println(Agencia);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Digite o número da conta: (Por Favor, insira apenas números. Sem traços ou Pontos.)"); // Estudar uma forma de fazer essa verificação
        Numero_Conta = scanner.nextInt();
        // System.out.println(Numero_Conta);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Insira o Saldo atual do Cliente: (Caso hajam centavos, use a vírgula!)");
        saldo = scanner.nextDouble();
        scanner.nextLine();
        // System.out.println(saldo);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Digite o Nome do Cliente: ");
        Nome_Cliente = scanner.nextLine();
        //System.out.print(Nome_Cliente);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Olá " + Nome_Cliente + ", obrigado por abrir sua conta no Banco JPS, sua Agência é: " + Agencia + ", seu número de conta é: " + Numero_Conta + ", com saldo incial e pronto para saque ou PIX no valor de R$ " + saldo);


        scanner.close();
    }
}

