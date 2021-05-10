package br.com.cadastroAnuncios;

public class RedesSociais {
	int calculoRedes = 0;
	
	/*
	 * Função responsável por fazer o cálculo de quantas visualizações geradas nas redes sociais
	 * 
	 * */
	public int compartilharAnuncioRedesSociais(int compartilhamRedesSociais, int novasVisualizacoesRedesSociais) {
			calculoRedes = compartilhamRedesSociais*novasVisualizacoesRedesSociais;
			return calculoRedes;
	}
}
