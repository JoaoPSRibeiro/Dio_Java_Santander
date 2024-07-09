package Testes_JUnit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AssertionsTeste {
    
    @Test
    void validarlancamentos(){

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento =  {-1, 5, 2, 3, 10,};
        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
   }
   @Test
   void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);
   }



}
