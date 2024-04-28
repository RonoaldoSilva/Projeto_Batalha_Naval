package batalha.naval.atv;

import java.util.Scanner;

public class Jogo {
    private Jogador jogador1;
    private Jogador jogador2;

    public Jogo(Tabuleiro tabuleiro1, Tabuleiro tabuleiro2, Scanner scanner){
        this.jogador1 = new Jogador(tabuleiro1, scanner);
        this.jogador2 = new Jogador(tabuleiro2, scanner);
    }
    public  void comecar(){
        //ciclo de jogo
    }
}
