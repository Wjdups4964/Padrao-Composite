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

    @Override
    public double somarPeso(double totalAcumulado) {
        // Não imprime nada aqui — só repassa a responsabilidade
        // pra cada filha, atualizando o total conforme cada uma soma.
        double total = totalAcumulado;
        for (PecaCarro peca : filhas) {
            total = peca.somarPeso(total);
        }
        return total;
    }
}