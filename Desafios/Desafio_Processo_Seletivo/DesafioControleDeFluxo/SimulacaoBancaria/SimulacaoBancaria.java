import java.util.Scanner;

public class SimulacaoBancaria {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);


String numeroConta = scanner.nextLine();

try {

verificarNumeroConta(numeroConta);

System.out.println("Nnmero de conta valido.");

} catch (IllegalArgumentException e) {

System.out.println("Erro: " + e.getMessage());

}

}

public static void verificarNumeroConta(String numeroConta) {

if(numeroConta.length() != 8) {

throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");

}

}

}