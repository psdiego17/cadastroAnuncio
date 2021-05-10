package br.com.cadastroAnuncios;

/*
 * Classe respons�vel por concatenar e calcular os met�dos e gerar o resultado de visualiza��es final.  
 * 
 * 
 * 
 * */
public class CalculoAnuncio {
	double totalGeralVisualizacoes = 0.0;
	
	//OBJETOS
	AnuncioOriginal aO = new AnuncioOriginal();
	RedesSociais rS = new RedesSociais();
	VisualizamCompartilham vC = new VisualizamCompartilham();
	
	//Met�do que c�lcula o valor final de visualiza��es do an�ncio.
	public double calcularAnuncio(double valorInvestido, int visualizamAnuncioOriginal, 
			int compartilhamRedesSociais, int novasVisualizacoesRedesSociais,
			int pessoasVisualizamAnuncio, int anuncioCompartilhado) {
		
		totalGeralVisualizacoes = aO.verAnuncioOriginal(valorInvestido, visualizamAnuncioOriginal)+
								  rS.compartilharAnuncioRedesSociais(compartilhamRedesSociais, novasVisualizacoesRedesSociais)+
								  vC.visualizarCompartilhar(pessoasVisualizamAnuncio, anuncioCompartilhado);
		
		return totalGeralVisualizacoes;
	}

}