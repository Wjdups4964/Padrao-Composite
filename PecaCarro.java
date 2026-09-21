/**
 * Component do padrão Composite.
 * Representa qualquer parte de um carro, seja uma peça individual
 * (Leaf) ou um agrupamento de peças (Composite).
 */
public interface PecaCarro {

    String getNome();

    /**
     * Peso total desta parte. Para uma folha, é o peso próprio.
     * Para um agrupamento, é a soma recursiva do peso de todas as subpartes.
     * Método "puro": não imprime nada.
     */
    double getPeso();

    /**
     * Percorre esta parte (e suas subpartes, se houver), somando o peso
     * a partir de um total acumulado vindo de fora. Cada peça individual
     * (folha) imprime uma linha com o total parcial atualizado.
     *
     * @param totalAcumulado total acumulado até agora (antes desta parte)
     * @return novo total acumulado, após somar esta parte
     */
    double somarPeso(double totalAcumulado);
}