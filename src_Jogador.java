import java.util.Scanner;

public class Jogador {

    String jogador1;
    String jogador2;
    String escolha;

    Scanner opcao = new Scanner(System.in);

    public String getJogador1() {
        return jogador1;
    }

    public void setJogador1(String jogador1) {
        this.jogador1 = jogador1;
    }

    public String getJogador2() {
        return jogador2;
    }

    public void setJogador2(String jogador2) {
        this.jogador2 = jogador2;
    }

    public void definirJogador() {
        System.out.println("Jogador1, você quer jogar com O ou X?: ");
        escolha = opcao.next();

        if (!(escolha.equals("X") || escolha.equals("O"))) {
            System.out.println("Escolha Somente O ou X!");
            definirJogador();
        }
        else {
            if (escolha.equals("X")) {
                jogador1 = escolha;
                jogador2 = "O";
            }
            if (escolha.equals("O")) {
                jogador1 = escolha;
                jogador2 = "X";
            }
            System.out.println("Jogador1, você jogará com " + jogador1 + ", Jogador2, você jogará com " + jogador2);
            System.out.println("Jogador1, você começa!");
        }
    }
}

