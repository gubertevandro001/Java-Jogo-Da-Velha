public class Jogo {

    boolean jogando = true;
    Mensagem mensagem = new Mensagem();
    Jogador jogador = new Jogador();
    Tabuleiro tabuleiro = new Tabuleiro();
    Jogadas jogadas = new Jogadas();
    Vitoria vitoria = new Vitoria();
    Empate empate = new Empate();

    public void checkJogo() {
        vitoria.checarVencedor(jogador, tabuleiro);
        empate.deuVelha(jogadas);
    }

    public void jogar() {
        mensagem.mensagemInicio();
        jogador.definirJogador();
        while (jogando) {
            jogadas.jogadaJogador1(jogador, tabuleiro);
            checkJogo();
            jogadas.jogadaJogador2(jogador, tabuleiro);
            checkJogo();

        }
    }
}
