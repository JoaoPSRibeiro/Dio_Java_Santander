package Equipamentos.multifuncional;


import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
	public void copiar() {
		System.out.println("Copiand via Equipamento Multifuncional");
	}
	public void digitalizar() {
		System.out.println("Digitalizando via Equipamento Multifuncional.");
	}
	public void imprimir() {
		System.out.println("Imprimindo via Equipamento Multifuncional.");
	}
	
}
