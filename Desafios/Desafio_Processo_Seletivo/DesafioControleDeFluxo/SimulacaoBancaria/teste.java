import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        double saque = 0; 

           for(double valorSaque = saque; limiteDiario > valorSaque; limiteDiario -= valorSaque){
                saque = scanner.nextDouble();
                if(saque == 0){
                    System.out.println("Transacoes encerradas.");
                    return;
                }else if(saque <= limiteDiario){
                        limiteDiario -= saque;
                        System.out.println("Saque realizado. Limite restante: " + limiteDiario);
                }else{
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    return;
                }

        }
        scanner.close(); 
        }
      
    }

// TODO: Crie um loop 'for' para iterar sobre os saques:

// TODO: Solicite ao usuário o valor do saque:
           

// TODO: Verifique se o valor do saque é zero, encerrando as transações:
// Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;

           
// TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
            

// TODO: Informe que o saque foi realizado e mostre o limite restante:
            

// Fechamos o Scanner para evitar vazamento de recursos:
