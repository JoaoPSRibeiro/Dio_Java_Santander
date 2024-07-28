package Testes_JUnit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTeste {
 
    
  @Test
  @EnabledIfEnvironmentVariable(named =  "USER", matches = "willyan")
    void validarAlgoSomenteNoUsuarioWillyan(){
        Assertions.assertEquals(10, 5 + 5);
    }

}
