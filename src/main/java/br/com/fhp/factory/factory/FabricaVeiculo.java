package br.com.fhp.factory.factory;

import br.com.fhp.factory.enumeradores.ClimaEnum;
import br.com.fhp.factory.enumeradores.CombustivelEnum;
import br.com.fhp.factory.modelo.*;

public class FabricaVeiculo implements Factory{

	public Veiculo controiCarro(ClimaEnum clima, int quanidadePessoa) {
		
		if(quanidadePessoa <=2){
			return new Tesla();
		}
		
		if(quanidadePessoa <= 5 && clima.equals(ClimaEnum.SOL)) {
			return new Escort();
		}
		
		if(quanidadePessoa <=5 && clima.equals(ClimaEnum.CHUVA)) {
			return new Opala();
		}

		if(quanidadePessoa > 5 && quanidadePessoa < 20) {
			return new Besta();
		}

		return null;
	}

	public Veiculo controiCarro(CombustivelEnum combustivel) {

		if(combustivel.equals(CombustivelEnum.GASOLINA)){
			return new Opala();
		}

		if(combustivel.equals(CombustivelEnum.ALCOOL)){
			return new Escort();
		}

		if(combustivel.equals(CombustivelEnum.DIESEL)){
			return new Besta();
		}

		if(combustivel.equals(CombustivelEnum.ELETRICIDADE)){
			return new Tesla();
		}

		return null;
	}
	
		
}
