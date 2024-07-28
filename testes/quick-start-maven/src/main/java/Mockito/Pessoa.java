package Mockito;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    
    private String nome;
    private String documento;
    private LocalDate nascimento;
    private DadosLocalizacao endereco;

    public Pessoa(final String nome, final String documento, final LocalDate nascimento){
        this.nome = nome;
        this.documento = documento;
        this.nascimento = nascimento;

    }
    public void adcionarDadosDeEndereco(DadosLocalizacao dadosLocalizacao){
        this.endereco = dadosLocalizacao;
        
    }

}
