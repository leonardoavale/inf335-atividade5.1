package br.unicamp.ic.inf335.beans;

import java.net.URL;
import java.util.ArrayList;

public class AnuncioBean implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Poduto anuncioado
	 */
	private ProdutoBean produto;
	/**
	 * Lista de Fotos do anuncio
	 */
	private ArrayList<URL> fotosUrl;
	/**
	 * Fra��o de desconto sendo 0 (0%) e 1 (100%)
	 */
	private Double desconto;
	
	
	
	public ProdutoBean getProduto() {
		return produto;
	}



	public void setProduto(ProdutoBean produto) {
		this.produto = produto;
	}



	public ArrayList<URL> getFotosUrl() {
		return fotosUrl;
	}



	public void setFotosUrl(ArrayList<URL> fotosUrl) {
		this.fotosUrl = fotosUrl;
	}



	public Double getDesconto() {
		return desconto;
	}



	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}


    /**
     * Contrutor default
     */
	public AnuncioBean () {
		produto = new ProdutoBean();
		fotosUrl = new ArrayList<URL>();
		desconto = 0.0;
	}


    /**
     * Contrutor com par�metros
     * @param produto
     * @param fotosUrl
     * @param desconto
     */
	public AnuncioBean(ProdutoBean produto, ArrayList<URL> fotosUrl, Double desconto) {
		super();
		this.produto = produto;
		this.fotosUrl = fotosUrl;
		this.desconto = desconto;
	}

	/**
	 * Calcula valor do anuncio 
	 * @return retona valor do produto menos o desconto 
	 */
	public Double getValor() {
		return produto.getValor()-(produto.getValor()*desconto);
	}
}
