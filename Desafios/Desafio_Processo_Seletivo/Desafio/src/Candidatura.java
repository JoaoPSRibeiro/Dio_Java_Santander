import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Candidatura {
    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
        System.out.println(" ");
        selecaoCandidatos();
        System.out.println(" ");
        imprimirSelecionados();
        System.out.println(" ");
        
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
    }
}
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = ! atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso!!!");
        }while(continuarTentando && tentativasRealizadas < 3);
            if (atendeu)
                System.out.println("Conseguimos contato com o candidato " + candidato + " após " + tentativasRealizadas + " tentativas.");
            else
                System.out.println("Não conseguimos contato com o candidato " + candidato + ", número máximo de tentativas " + tentativasRealizadas);
        }
    
    // método auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
    static void selecaoCandidatos(){
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};

        int canditatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(canditatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O Candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O Candidato " + candidato + " foi selecionado para a vaga.");
                canditatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato.");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar com Contra Proposta.");
        }else{
            System.out.println("Aguardar Resultados dos outros candidatos.");
        }
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo e mostrando o índice do elemento: ");
        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é o " + candidatos[indice]);
        }
        System.out.println("Abaixo uma forma abreviada de fazer o laço FOR, conhecido com For EACH ou, para cada.");
        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }
}