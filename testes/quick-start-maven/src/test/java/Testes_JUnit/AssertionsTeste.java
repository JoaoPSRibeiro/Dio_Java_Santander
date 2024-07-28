package Testes_JUnit;

import java.time.LocalDateTime;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
//POdemos fazer a importação estática dos assertions, já colocando qual tipo vamos utilizar. Isso nos poupará ter que escrever ASSERTIONS toda vez.... com * importamos todas as assertions de uma vez
public class AssertionsTeste {
    
    @Test
    void validarlancamentos(){

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento =  {-1, 5, 2, 3, 10,};
        assertArrayEquals(primeiroLancamento, segundoLancamento);
   }
   @Test
   void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("João Paulo", LocalDateTime.now());
        assertNotNull(pessoa);
    }
    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor1 = 5.0;
        double valor2 = 5.2;
        assertEquals(valor1, valor2);
    }


}
