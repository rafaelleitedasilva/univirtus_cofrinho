package uninter;

class Real extends Moeda {
    public Real(double valor) {
        super("Real", valor);
    }

    @Override
    public double converterParaReal() {
        return valor; // O valor já está em Real
    }
}