package br.com.cadastroAnuncios;

/*
 * Classe responsável por concatenar e calcular os metódos e gerar o resultado de visualizações final.  
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
	
	//Metódo que cálcula o valor final de visualizações do anúncio.
	public double calcularAnuncio(double valorInvestido, int visualizamAnuncioOriginal, 
			int compartilhamRedesSociais, int novasVisualizacoesRedesSociais,
			int pessoasVisualizamAnuncio, int anuncioCompartilhado) {
		
		totalGeralVisualizacoes = aO.verAnuncioOriginal(valorInvestido, visualizamAnuncioOriginal)+
								  rS.compartilharAnuncioRedesSociais(compartilhamRedesSociais, novasVisualizacoesRedesSociais)+
								  vC.visualizarCompartilhar(pessoasVisualizamAnuncio, anuncioCompartilhado);
		
		return totalGeralVisualizacoes;
	}

}