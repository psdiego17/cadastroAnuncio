package br.com.cadastroAnuncios;

public class AnuncioOriginal {
	double calculo = 0.0;
	double totalInvestido = 0.0;
	double dias = 0.0;
	
	/*
	 * Função responsável por fazer o cálculo de quantas visualizações será obtida
	 * com base no valor investido.
	 * */ 
	public double verAnuncioOriginal(double valorInvestido, int visualizamAnuncioOriginal) {
		calculo = valorInvestido*visualizamAnuncioOriginal;
		return calculo;
	}

	
	public double investimento(double valorInvestido, double dataInicio, double dataFinal) {
		dias = dataFinal-dataInicio;
		totalInvestido = valorInvestido*dias;
		return totalInvestido;
	}
}
