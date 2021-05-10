package br.com.cadastroAnuncios;
import java.util.Scanner;


public class Index {
	public static void main(String[]args){

		Scanner capturaDados = new Scanner(System.in);
		
		String nomeAnuncio;
		String cliente;
		double dataInicio;
		double dataFinal;
				
		double valorInvestido = 0.0;               //Valor Investido  
		final int visualizamAnuncioOriginal = 30; //30 pessoas visualizam o an�ncio original (n�o compartilhado) a cada R$ 1,00 investido.
		
		int pessoasVisualizamAnuncio = 100;      //a cada 100 pessoas que visualizam o an�ncio 12 clicam nele.
		int anuncioCompartilhado = 4;            //o mesmo an�ncio � compartilhado no m�ximo 4 vezes em sequ�ncia.
		
		int compartilhamRedesSociais = 3;        //a cada 20 pessoas que clicam no an�ncio 3 compartilham nas redes sociais.
		int novasVisualizacoesRedesSociais = 40; //cada compartilhamento nas redes sociais gera 40 novas visualiza��es.
		
		//ENTRADA DE DADOS
		System.out.print("Informe o nome do an�ncio: ");
		nomeAnuncio = capturaDados.nextLine();
		System.out.print("Informe o cliente: ");
		cliente = capturaDados.nextLine();
		System.out.print("Informe a data de in�cio: ");
		dataInicio = capturaDados.nextDouble();
		System.out.print("Informe a data de t�rmino: ");
		dataFinal = capturaDados.nextDouble();
		System.out.print("Informe o valor que vai investir R$ ");
		valorInvestido = capturaDados.nextDouble();	
		
		
		//OBJETOS
		CalculoAnuncio cA = new CalculoAnuncio();
		double resultadoFinal = cA.calcularAnuncio(valorInvestido, visualizamAnuncioOriginal, 
													compartilhamRedesSociais, novasVisualizacoesRedesSociais, 
													pessoasVisualizamAnuncio, anuncioCompartilhado);
		
		VisualizamCompartilham vC = new VisualizamCompartilham();
		int totalCompartilhamento = vC.Compartilhar(anuncioCompartilhado, compartilhamRedesSociais);
		
		Cliques c = new Cliques();
		int totalCliques = c.clicar(pessoasVisualizamAnuncio);
		
		AnuncioOriginal aO = new AnuncioOriginal(); 
		double totalInvestimento = aO.investimento(valorInvestido, dataInicio, dataFinal);
		
		//SA�DA DE DADOS
		System.out.println("");
		System.out.println("Valor total investido R$ "+totalInvestimento);	
		System.out.println("Quantidade m�xima de visualiza��es: "+resultadoFinal);	
		System.out.println("Quantidade m�xima de cliques: "+totalCliques);	
		System.out.println("Quantidade m�ximo de compartilhamentos: "+totalCompartilhamento);
	}	
}
