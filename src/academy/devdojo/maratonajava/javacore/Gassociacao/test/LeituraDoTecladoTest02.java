package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não:");
        Scanner input = new Scanner(System.in);
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

    }
}
