import java.util.Arrays;

public class Tabuleiro {

    String[][] tabuleiro = {{"_", "_", "_"}, {"_", "_", "_"}, {"_", "_", "_"}};

    public void mostrarTabuleiro() {
        for (String[] posicao : tabuleiro) {
            System.out.println(Arrays.toString(posicao));
        }
    }
}
