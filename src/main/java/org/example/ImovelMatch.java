package org.example;

public class ImovelMatch {

	public double MostrarMaiorValor(double valor1, double valor2) {

        return Math.max(valor1, valor2);
		
	}
	
	
	public boolean VerificarExistenciaTipoImovel(String tipoImovel) {

        return switch (tipoImovel.toLowerCase()) {
            case "casa" -> true;
            case "apartamento" -> true;
            case "terreno" -> true;
            case "galp?o" -> true;
            default -> false;
        };
		
	}
	
	
	public boolean VerificarLogin(String email, String senha) {
		
		if (email == "gustavosmensey@gmail.com") {
			if(senha == "09838648965")
				return true;
			else
				return false;
		}
		else {
			return false;
		}
			
	}
	
	
	public boolean VerificarExistenciaEmpresa(String cnpj) {
		
		switch (cnpj) {
			case "0874596856":
				return true;
			case "0874596858":
				return true;
			case "0874596857":
				return true;
			case "0874596853":
				return true;
			case "0874596852":
				return true;
			default:
				return false;
		}
			
	}
	
}
