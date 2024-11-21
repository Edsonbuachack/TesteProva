package pr.senac.br.imovelmatch;

import java.util.Arrays;
import java.util.List;


public class ImovelMatch {

    public boolean AvaliarProximidadeServico(String tipoServico) {
        List<String> servicosEssenciais = Arrays.asList("escola", "hospital", "mercado", "transporte publico");
        return servicosEssenciais.contains(tipoServico.toLowerCase());
    }

    public double CalcularTaxaDeCondominio(String tipoImovel, double area) {
        switch (tipoImovel.toLowerCase()) {
            case "apartamento":
                return area * 2.5; // Exemplo: R$2,50 por metro quadrado
            case "casa":
                return area * 1.8; // Exemplo: R$1,80 por metro quadrado
            default:
                return 0.0; // Sem taxa para outros tipos
        }
    }

    public boolean ValidarCadastroDeImovel(String titulo, String endereco, double preco) {
        return titulo != null && !titulo.isEmpty() &&
               endereco != null && !endereco.isEmpty() &&
               preco > 0;
    }

    public boolean FiltrarPorPreco(double preco, double minimo, double maximo) {
        return preco >= minimo && preco <= maximo;
    }
}
