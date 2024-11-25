package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImovelMatchTest {

	@Test
	public void TestarMaiorValor() {
		
		ImovelMatch imovel = new ImovelMatch();
		
		double valor1 = 87.5;
		double valor2 = 8745.5;

		Assertions.assertEquals(8745.5, imovel.MostrarMaiorValor(valor1, valor2), 0.001);
		
	}
	
	@Test
	public void TestarVerificarExistenciaTipoImovel() {
		
		ImovelMatch imovel = new ImovelMatch();
		
		String tipoImovel = "galp?o";
		
		Assertions.assertTrue(imovel.VerificarExistenciaTipoImovel(tipoImovel));
		
	}
	
	@Test
	public void TestarVerificarLogin() {
		
		ImovelMatch imovel = new ImovelMatch();
		
		String email = "gustavosmensey@gmail.com";
		String senha = "09838648965";
		
		Assertions.assertTrue(imovel.VerificarLogin(email, senha));
		
	}
	
	@Test
	public void TestarVerificarExistenciaEmpresa() {
		
		ImovelMatch imovel = new ImovelMatch();
		
		String cnpj = "0874596857";
		
		Assertions.assertTrue(imovel.VerificarExistenciaEmpresa(cnpj));
		
	}
	
}
