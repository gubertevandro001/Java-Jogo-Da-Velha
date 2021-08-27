public class Vitoria {

    public void checarVencedor(Jogador jogador, Tabuleiro tabuleiro) {
        if (tabuleiro.tabuleiro[0][0].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[1][0].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[2][0].equals(jogador.getJogador1()) ||
                tabuleiro.tabuleiro[0][1].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[1][1].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[2][1].equals(jogador.getJogador1()) ||
                tabuleiro.tabuleiro[0][2].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[1][2].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[2][2].equals(jogador.getJogador1()) ||
                tabuleiro.tabuleiro[0][0].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[0][1].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[0][2].equals(jogador.getJogador1()) ||
                tabuleiro.tabuleiro[1][0].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[1][1].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[1][2].equals(jogador.getJogador1()) ||
                tabuleiro.tabuleiro[2][0].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[2][1].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[2][2].equals(jogador.getJogador1()) ||
                tabuleiro.tabuleiro[0][0].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[1][1].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[2][2].equals(jogador.getJogador1()) ||
                tabuleiro.tabuleiro[0][2].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[1][1].equals(jogador.getJogador1()) && tabuleiro.tabuleiro[2][0].equals(jogador.getJogador1())) {
            System.out.println("Parabéns Jogador1, você ganhou!!");
            System.exit(1);
        }
        else if (tabuleiro.tabuleiro[0][0].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[1][0].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[2][0].equals(jogador.getJogador2()) ||
                tabuleiro.tabuleiro[0][1].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[1][1].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[2][1].equals(jogador.getJogador2()) ||
                tabuleiro.tabuleiro[0][2].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[1][2].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[2][2].equals(jogador.getJogador2()) ||
                tabuleiro.tabuleiro[0][0].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[0][1].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[0][2].equals(jogador.getJogador2()) ||
                tabuleiro.tabuleiro[1][0].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[1][1].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[1][2].equals(jogador.getJogador2()) ||
                tabuleiro.tabuleiro[2][0].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[2][1].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[2][2].equals(jogador.getJogador2()) ||
                tabuleiro.tabuleiro[0][0].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[1][1].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[2][2].equals(jogador.getJogador2()) ||
                tabuleiro.tabuleiro[0][2].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[1][1].equals(jogador.getJogador2()) && tabuleiro.tabuleiro[2][0].equals(jogador.getJogador2())) {
            System.out.println("Parabéns Jogador2, você ganhou!!");
            System.exit(1);
        }
    }
}
