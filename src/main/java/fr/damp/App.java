package fr.damp;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int scoreTotal = 0;
        Scanner clavier = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            Random generateur = new Random();
            int lancer = generateur.nextInt(6) + 1;

            System.out.println("Votre lancer " + i + " est égal à :" + lancer);
            scoreTotal = lancer + scoreTotal;
            clavier.nextLine();
        }
        System.out.println("Ton score est de " + scoreTotal);
        if (scoreTotal == 20) {
            System.out.println("Bravo vous êtes bien arrivé a 20 !!");
        } else
            System.out.println("Dommage tu as perdu...");
    }

}
