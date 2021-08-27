public class Empate {

    public void deuVelha(Jogadas jogadas) {
        if (jogadas.count == 9) {
            System.out.println("Empate!");
            System.exit(1);
        }
    }
}
