package br.com.fhp.factory.factory;

import br.com.fhp.factory.enumeradores.ClimaEnum;
import br.com.fhp.factory.enumeradores.CombustivelEnum;
import br.com.fhp.factory.modelo.Veiculo;

public interface Factory {
	
	public Veiculo controiCarro(ClimaEnum clima, int quanidadePessoa);

	public Veiculo controiCarro(CombustivelEnum combustivel);
}
