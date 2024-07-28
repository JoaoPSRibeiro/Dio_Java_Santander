package Testes_JUnit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExceptionsTeste {
    

    @Test
    void validarCenarioExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123466", 0);
        Conta contaDestino = new Conta("456789", 1000);

        TransferenciasEntreContas transferenciasEntreContas = new TransferenciasEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> transferenciasEntreContas.transfere(contaOrigem, contaDestino, -1));

    }

}
