package br.com.cadastroAnuncios;

public class RedesSociais {
	int calculoRedes = 0;
	
	/*
	 * Fun��o respons�vel por fazer o c�lculo de quantas visualiza��es geradas nas redes sociais
	 * 
	 * */
	public int compartilharAnuncioRedesSociais(int compartilhamRedesSociais, int novasVisualizacoesRedesSociais) {
			calculoRedes = compartilhamRedesSociais*novasVisualizacoesRedesSociais;
			return calculoRedes;
	}
}
