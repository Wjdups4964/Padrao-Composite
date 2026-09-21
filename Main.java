public class Main {
    public static void main(String[] args) {

        // Trem de força
        PecaComposta tremDeForca = new PecaComposta("Trem de força");
        tremDeForca.adicionar(new PecaSimples("Motor", 150));
        tremDeForca.adicionar(new PecaSimples("Transmissão", 60));
        tremDeForca.adicionar(new PecaSimples("Diferencial", 40));
        tremDeForca.adicionar(new PecaSimples("Rodas", 80));

        // Chassi
        PecaComposta chassi = new PecaComposta("Chassi");
        chassi.adicionar(tremDeForca);
        chassi.adicionar(new PecaSimples("Suspensão", 50));

        // Carroceria
        PecaComposta carroceria = new PecaComposta("Carroceria");
        carroceria.adicionar(new PecaSimples("Para-lamas", 20));
        carroceria.adicionar(new PecaSimples("Portas", 45));
        carroceria.adicionar(new PecaSimples("Painéis", 30));
        carroceria.adicionar(new PecaSimples("Porta-malas", 15));
        carroceria.adicionar(new PecaSimples("Capô", 18));

        // Carro
        PecaComposta carro = new PecaComposta("Carro");
        carro.adicionar(carroceria);
        carro.adicionar(chassi);

        double total = carro.somarPeso(0);

        System.out.println("Peso total do carro: " + total);
    }
}