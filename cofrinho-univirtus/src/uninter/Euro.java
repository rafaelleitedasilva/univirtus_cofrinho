package uninter;

class Euro extends Moeda {
    public Euro(double valor) {
        super("Euro", valor);
    }

    @Override
    public double converterParaReal() {
        // Lógica de conversão para Real
        return valor * 6.0; // Supondo uma conversão simples
    }
}
