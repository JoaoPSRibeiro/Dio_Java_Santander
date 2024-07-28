package Testes_JUnit;

import java.lang.System.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
    
    public static void iniciarConexao(){
        LOGGER.info("iniciou conexão");
    }

    public static void finalizarConexao(){
        LOGGER.info("Finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa){
        //insere esta essa no banco de dados
        LOGGER.info("Inseriu dados");
    }
    public static void removeDados(Pessoa pessoa){
        //Remove esta essa no banco de dados
        LOGGER.info("Removeu dados");
    }
}
