package Testes_JUnit;

public class TransferenciasEntreContas {
    
    public void transfere(Conta contaOrigem, Conta contaDestino, int valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
    }
}
