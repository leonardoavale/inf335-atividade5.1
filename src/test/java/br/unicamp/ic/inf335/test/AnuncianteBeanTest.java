package br.unicamp.ic.inf335.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.beans.AnuncianteBean;
import br.unicamp.ic.inf335.beans.AnuncioBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;




public class AnuncianteBeanTest {

	private AnuncianteBean anunciante = new AnuncianteBean();
	private ArrayList<AnuncioBean> anuncios = new ArrayList<AnuncioBean>();
		
	@Test
	void testAddAnuncio() {
		AnuncioBean nAnuncio = new AnuncioBean();
		anunciante.addAnuncio(nAnuncio);
		assertEquals(1, anunciante.getAnuncios().size());
	}
	
	@Test
	void testRemoveAnuncio() {
		AnuncioBean nAnuncio = new AnuncioBean();
		anuncios.add(nAnuncio);
		anunciante.setAnuncios(anuncios);
		anunciante.removeAnuncio(0);
		assertEquals(0, anunciante.getAnuncios().size());
	}
	
	@Test
	void testValorMedioAnuncios() {
		AnuncioBean nAnuncio = new AnuncioBean(new ProdutoBean("A", "Camiseta", "Roupa", 100.0, "Novo"),
				new ArrayList<URL>(),
				0.05);
		AnuncioBean nAnuncio2 = new AnuncioBean(new ProdutoBean("B", "Camiseta", "Roupa", 115.0, "Novo"),
				new ArrayList<URL>(),
				0.0);
		anuncios.add(nAnuncio);
		anuncios.add(nAnuncio2);
		anunciante.setAnuncios(anuncios);
		assertEquals(105, anunciante.valorMedioAnuncios());
	}

	@Test
	void expectIndexOutOfBoundsException() {
		assertThrows(IndexOutOfBoundsException.class, () -> anunciante.valorMedioAnuncios());
	}
	
}
