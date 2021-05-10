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
		final int visualizamAnuncioOriginal = 30; //30 pessoas visualizam o anúncio original (não compartilhado) a cada R$ 1,00 investido.
		
		int pessoasVisualizamAnuncio = 100;      //a cada 100 pessoas que visualizam o anúncio 12 clicam nele.
		int anuncioCompartilhado = 4;            //o mesmo anúncio é compartilhado no máximo 4 vezes em sequência.
		
		int compartilhamRedesSociais = 3;        //a cada 20 pessoas que clicam no anúncio 3 compartilham nas redes sociais.
		int novasVisualizacoesRedesSociais = 40; //cada compartilhamento nas redes sociais gera 40 novas visualizações.
		
		//ENTRADA DE DADOS
		System.out.print("Informe o nome do anúncio: ");
		nomeAnuncio = capturaDados.nextLine();
		System.out.print("Informe o cliente: ");
		cliente = capturaDados.nextLine();
		System.out.print("Informe a data de início: ");
		dataInicio = capturaDados.nextDouble();
		System.out.print("Informe a data de término: ");
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
		
		//SAÍDA DE DADOS
		System.out.println("");
		System.out.println("Valor total investido R$ "+totalInvestimento);	
		System.out.println("Quantidade máxima de visualizações: "+resultadoFinal);	
		System.out.println("Quantidade máxima de cliques: "+totalCliques);	
		System.out.println("Quantidade máximo de compartilhamentos: "+totalCompartilhamento);
	}	
}
