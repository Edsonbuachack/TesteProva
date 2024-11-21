package pr.senac.br.imovelmatch;

import org.junit.Assert;
import org.junit.Test;


public class ImovelMatchTeste {

    @Test
    public void TestarAvaliarProximidadeServico() {
        ImovelMatch imovel = new ImovelMatch();
        Assert.assertTrue(imovel.AvaliarProximidadeServico("escola"));
        Assert.assertFalse(imovel.AvaliarProximidadeServico("cinema"));
    }

    @Test
    public void TestarCalcularTaxaDeCondominio() {
        ImovelMatch imovel = new ImovelMatch();
        Assert.assertEquals(250.0, imovel.CalcularTaxaDeCondominio("apartamento", 100), 0.001);
        Assert.assertEquals(180.0, imovel.CalcularTaxaDeCondominio("casa", 100), 0.001);
        Assert.assertEquals(0.0, imovel.CalcularTaxaDeCondominio("galpao", 100), 0.001);
    }

    @Test
    public void TestarValidarCadastroDeImovel() {
        ImovelMatch imovel = new ImovelMatch();
        Assert.assertTrue(imovel.ValidarCadastroDeImovel("Apartamento Luxo", "Rua das Flores, 123", 300000.0));
        Assert.assertFalse(imovel.ValidarCadastroDeImovel("", "Rua das Flores, 123", 300000.0));
        Assert.assertFalse(imovel.ValidarCadastroDeImovel("Apartamento Luxo", "", 300000.0));
        Assert.assertFalse(imovel.ValidarCadastroDeImovel("Apartamento Luxo", "Rua das Flores, 123", -5000.0));
    }

    @Test
    public void TestarFiltrarPorPreco() {
        ImovelMatch imovel = new ImovelMatch();
        Assert.assertTrue(imovel.FiltrarPorPreco(500000.0, 400000.0, 600000.0));
        Assert.assertFalse(imovel.FiltrarPorPreco(300000.0, 400000.0, 600000.0));
    }
}
