package br.unicamp.ic.inf335.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.beans.ProdutoBean;


public class ProdutoBeanTest {

	ProdutoBean produto = new ProdutoBean();
	ProdutoBean produto2 = new ProdutoBean();
	
	@Test
	void testCompareTo() {
		produto.setValor(100.0);
		produto2.setValor(110.0);
		assertEquals(-1,produto.compareTo(produto2));
	}
}
