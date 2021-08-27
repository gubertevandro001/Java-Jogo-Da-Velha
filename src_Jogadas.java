import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogadas {

    ArrayList<Integer> posicoesJogadas = new ArrayList<>();
    Scanner escolhaPosicao = new Scanner(System.in);
    int posicao;
    int count = 0;

    public void jogadaJogador1(Jogador jogador, Tabuleiro tabuleiro) {
        try {
            System.out.print("Jogador1, em qual posição você deseja jogar? Escolha de 1 a 9: ");
            posicao = escolhaPosicao.nextInt();

            if (posicoesJogadas.contains(posicao)) {
                System.out.println("Posição já ocupada, jogue novamente!");
                jogadaJogador1(jogador, tabuleiro);
            } else if (posicao > 9 || posicao == 0) {
                System.out.println("Posições só vão até 9, jogue novamente!");
                jogadaJogador1(jogador, tabuleiro);
            } else {
                posicoesJogadas.add(posicao);
                if (posicao >= 1 && posicao <= 3) {
                    tabuleiro.tabuleiro[0][posicao - 1] = jogador.getJogador1();
                } else if (posicao >= 4 && posicao <= 6) {
                    tabuleiro.tabuleiro[1][posicao - 4] = jogador.getJogador1();
                } else if (posicao >= 7) {
                    tabuleiro.tabuleiro[2][posicao - 7] = jogador.getJogador1();
                }
                tabuleiro.mostrarTabuleiro();
                count += 1;
            }
        } catch (InputMismatchException mismatchException) {
            System.out.println("Digite Somente Números!");
            escolhaPosicao.next();
            jogadaJogador1(jogador, tabuleiro);
        }
    }

    public void jogadaJogador2(Jogador jogador, Tabuleiro tabuleiro) {
        try {
            System.out.print("Jogador2, em qual posição você deseja jogar? Escolha de 1 a 9: ");
            posicao = escolhaPosicao.nextInt();

            if (posicoesJogadas.contains(posicao)) {
                System.out.println("Posição já ocupada, jogue novamente!");
                jogadaJogador2(jogador, tabuleiro);
            } else if (posicao > 9 || posicao == 0) {
                System.out.println("Posições só vão até 9, jogue novamente!");
                jogadaJogador2(jogador, tabuleiro);
            } else {
                posicoesJogadas.add(posicao);
                if (posicao >= 1 && posicao <= 3) {
                    tabuleiro.tabuleiro[0][posicao - 1] = jogador.getJogador2();
                } else if (posicao >= 4 && posicao <= 6) {
                    tabuleiro.tabuleiro[1][posicao - 4] = jogador.getJogador2();
                } else if (posicao >= 7) {
                    tabuleiro.tabuleiro[2][posicao - 7] = jogador.getJogador2();
                }
                tabuleiro.mostrarTabuleiro();
                count +=1;
            }
        } catch (InputMismatchException mismatchException) {
            System.out.println("Digite Somente Números!");
            escolhaPosicao.next();
            jogadaJogador2(jogador, tabuleiro);
        }
    }
}


