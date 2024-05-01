package uninter;
import java.util.ArrayList;

class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public void removerMoeda(String nomeMoeda, double valorRemover) {
        boolean moedaEncontrada = false;
        for (Moeda moeda : moedas) {
            if (moeda.getNome().equalsIgnoreCase(nomeMoeda)) {
                if (moeda.getValor() >= valorRemover) {
                    moeda.subtrairValor(valorRemover);
                    moedaEncontrada = true;
                    break;
                } else {
                    System.out.println("Valor a ser removido excede o valor que você possui.");
                    return;
                }
            }
        }
        if (!moedaEncontrada) {
            System.out.println("Moeda não encontrada.");
        }
    }

    public void listarMoedas() {
        for (Moeda moeda : moedas) {
            System.out.println(moeda.getNome() + ": " + moeda.getValor());
        }
    }

    public double calcularTotalEmReal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}