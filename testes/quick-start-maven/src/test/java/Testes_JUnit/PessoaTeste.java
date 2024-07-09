package Testes_JUnit;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PessoaTeste {
    

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000,1,1,15,0,0));
        Assertions.assertEquals(22, jessica.getIdade());
        // é esperado que jessica tenha 22 anos
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000,1,1,15,0,0));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("Joao", LocalDateTime.now()); //-> cria o cenário de teste
        Assertions.assertFalse(joao.ehMaiorDeIdade()); // -> Executa as validações
    }
}
