package fr.damp;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int scoreTotal = 10;
        Scanner clavier = new Scanner(System.in);

        while (scoreTotal != 20) {
            scoreTotal = 0;
            for (int i = 1; i <= 5; i++) {
                Random generateur = new Random();
                int lancer = generateur.nextInt(6) + 1;

                scoreTotal = lancer + scoreTotal;
                System.out.println(
                        "Votre lancer " + i + " est égal à :" + lancer + ".Vous êtes a la case : " + scoreTotal);
            }
            System.out.println("Ton score est de " + scoreTotal);
            if (scoreTotal == 20) {
                System.out.println("Bravo vous êtes bien arrivé a 20 !!");
            } else
                System.out.println("Dommage tu as perdu...");
        }
    }

}
