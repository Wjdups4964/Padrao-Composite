/**
 * Leaf do Composite: uma peça individual do carro, sem subpartes
 * (ex.: para-lama, porta, motor, rodas...).
 */
public class PecaSimples implements PecaCarro {

    private final String nome;
    private final double peso;

    public PecaSimples(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPeso() {
        return peso;
    }
}