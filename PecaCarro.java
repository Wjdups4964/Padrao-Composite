/**
 * Component do padrão Composite.
 * Representa qualquer parte de um carro, seja uma peça individual
 * (Leaf) ou um agrupamento de peças (Composite).
 */
public interface CarPart {

    String getNome();

    /**
     * Peso total desta parte. Para uma folha, é o peso próprio.
     * Para um agrupamento, é a soma recursiva do peso de todas as subpartes.
     */
    double getPeso();
}