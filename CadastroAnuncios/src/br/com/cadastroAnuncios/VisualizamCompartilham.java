package br.com.cadastroAnuncios;

public class VisualizamCompartilham {
	int calculoVisualizacao = 0;
	int compartilha = 0;
	
	/*
	 * Fun��o respons�vel por fazer o c�lculo de quantas visualiza��es geradas por compartilhamento
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
