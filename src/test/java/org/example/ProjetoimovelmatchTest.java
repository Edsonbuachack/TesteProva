package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProjetoimovelmatchTest {

    @Test
    public void TestarAvaliarProximidadeServico() {
        Projetoimovelmatch imovel = new Projetoimovelmatch();
        assertTrue(imovel.AvaliarProximidadeServico("escola"));
        assertFalse(imovel.AvaliarProximidadeServico("cinema"));
    }

    @Test
    public void TestarCalcularTaxaDeCondominio() {
        Projetoimovelmatch imovel = new Projetoimovelmatch();
        assertEquals(250.0, imovel.CalcularTaxaDeCondominio("apartamento", 100), 0.001);
        assertEquals(180.0, imovel.CalcularTaxaDeCondominio("casa", 100), 0.001);
        assertEquals(0.0, imovel.CalcularTaxaDeCondominio("galpao", 100), 0.001);
    }

    @Test
    public void TestarValidarCadastroDeImovel() {
        Projetoimovelmatch imovel = new Projetoimovelmatch();
        assertTrue(imovel.ValidarCadastroDeImovel("Apartamento Luxo", "Rua das Flores, 123", 300000.0));
        assertFalse(imovel.ValidarCadastroDeImovel("", "Rua das Flores, 123", 300000.0));
        assertFalse(imovel.ValidarCadastroDeImovel("Apartamento Luxo", "", 300000.0));
        assertFalse(imovel.ValidarCadastroDeImovel("Apartamento Luxo", "Rua das Flores, 123", -5000.0));
    }

    @Test
    public void TestarFiltrarPorPreco() {
        Projetoimovelmatch imovel = new Projetoimovelmatch();
        assertTrue(imovel.FiltrarPorPreco(500000.0, 400000.0, 600000.0));
        assertFalse(imovel.FiltrarPorPreco(300000.0, 400000.0, 600000.0));
    }
}
