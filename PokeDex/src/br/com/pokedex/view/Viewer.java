package br.com.pokedex.view;

import java.util.Scanner;

public class Viewer {
    
    public int imprimeHeader(){
        
        System.out.println();
        System.out.println("|===============================|");
        System.out.println("|                               |");
        System.out.println("|   Seja bem vindo a Pokedex!   |");
        System.out.println("|                               |");
        System.out.println("|  Selecione a opcao desejada:  |");
        System.out.println("|                               |");
        System.out.println("|                               |");
        System.out.println("|  1-Escolher pokemon   2-Sair  |");
        System.out.println("|                               |");
        System.out.println("|===============================|");
        System.out.println();
    
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        System.out.println();
        return opcao;
    }

    public int escolhePokemon(){
        System.out.println();
        System.out.println("|===============================|");
        System.out.println("|   Digite o numero do pokemon  |");
        System.out.println("|       a ser verificado:       |");
        System.out.println("|===============================|");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int pokeNum = scanner.nextInt() - 1;

        System.out.println();
        return pokeNum;
    }

    

}
