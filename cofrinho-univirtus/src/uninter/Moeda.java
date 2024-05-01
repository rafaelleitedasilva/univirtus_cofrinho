package uninter;

//Classe mãe abstrata Moeda
abstract class Moeda {
 protected String nome;
 protected double valor;

 public Moeda(String nome, double valor) {
     this.nome = nome;
     this.valor = valor;
 }
 
 public void subtrairValor(double valor) {
     this.valor -= valor;
 }

 public String getNome() {
     return nome;
 }

 public double getValor() {
     return valor;
 }

 // Método abstrato para converter o valor da moeda para Real
 public abstract double converterParaReal();
}
