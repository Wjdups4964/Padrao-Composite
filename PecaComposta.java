import java.util.ArrayList;
import java.util.List;

/**
 * Composite do padrão Composite: um agrupamento de PecaCarro
 * (que podem ser outras PecaSimples ou outras PecaComposta, permitindo
 * qualquer profundidade de árvore).
 */
public class PecaComposta implements PecaCarro {

    private final String nome;
    private final List<PecaCarro> filhas = new ArrayList<>();

    public PecaComposta(String nome) {
        this.nome = nome;
    }

    public void adicionar(PecaCarro peca) {
        filhas.add(peca);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPeso() {
        double total = 0;
        for (PecaCarro peca : filhas) {
            total += peca.getPeso();
        }
        return total;
    }
}