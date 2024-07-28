package Testes_JUnit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class AssumptionsTeste {
    

    @Test
    void validarAlgoSomenteNoUsuarioWillian(){
        Assumptions.assumeTrue("willian".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
