package br.com.cadastroAnuncios;

public class VisualizamCompartilham {
	int calculoVisualizacao = 0;
	int compartilha = 0;
	
	/*
	 * Função responsável por fazer o cálculo de quantas visualizações geradas por compartilhamento
	*/
	
	public int visualizarCompartilhar(int pessoasVisualizamAnuncio, int anuncioCompartilhado) {
				calculoVisualizacao = pessoasVisualizamAnuncio*anuncioCompartilhado;
				return calculoVisualizacao;
	}
	
	public int Compartilhar(int anuncioCompartilhado , int compartilhamRedesSociais) {
		compartilha = anuncioCompartilhado + compartilhamRedesSociais;
		return compartilha;
}
}
