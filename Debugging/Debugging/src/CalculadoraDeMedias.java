import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila","Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Media da Turma %.1f", media);
    }
    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}

// neste programa, o erro semântico era o uso de int no lugar de double. 
// usando o int, o resultado da média sempre será inteiro e não terá casa decimal
// usando o double, teremos médias mais corretas