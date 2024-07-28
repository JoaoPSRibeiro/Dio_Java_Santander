package Mockito_Testes;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

import Mockito.CadastrarPessoa;
import Mockito.DadosLocalizacao;
import Testes_JUnit.Pessoa;
import net.bytebuddy.asm.Advice.Local;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {
    
    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){

        DadosLocalizacao dadosLocalizacao =  new DadosLocalizacao("MG", "Patos de Minas", "Rua 2", "Apto 10", "Centro");

        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("05046001")).thenReturn(dadosLocalizacao);
        Mockito.Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("João","254809855",  LocalDate.now(), "05046001");

        assertEquals("João", pessoa.getNome());
        assertEquals("254809855", pessoa.getDocumento());
        assertEquals("MG", pessoa.getUf());
        assertEquals("Apto 10", pessoa.getComplemento());
        


    }
}
