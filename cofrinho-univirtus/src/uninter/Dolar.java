package uninter;

//Classes filhas concretas
class Dolar extends Moeda {
	 public Dolar(double valor) {
	     super("Dólar", valor);
	 }
	
	 @Override
	 public double converterParaReal() {
	     // Aqui poderia ser implementada a lógica de conversão para Real
	     // Por simplicidade, vamos apenas retornar o valor em dólar
	     return valor * 5.0; // Supondo uma conversão simples
	 }
}
