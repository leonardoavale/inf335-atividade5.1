package br.unicamp.ic.inf335.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


import br.unicamp.ic.inf335.beans.AnuncioBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;


public class AnuncioBeanTest {

AnuncioBean anuncio = new AnuncioBean();
	
	@Test
	void testGetValor() {
		ProdutoBean produto = new ProdutoBean("A", "Camiseta", "Roupa", 100.0, "Novo");
		anuncio.setProduto(produto);
		anuncio.setDesconto(0.05);
		assertEquals(95,anuncio.getValor());
	}
	
	
}
