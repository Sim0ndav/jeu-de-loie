package fr.damp;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int Objectif = 20;
        int caseCourante = 0;
        int nbLancers = 0;

        while (caseCourante != 20) {

            Random generateur = new Random();
            int lancer = generateur.nextInt(6) + 1;
            nbLancers++;
            caseCourante = lancer + caseCourante;

            if (caseCourante > Objectif) {
                int depassement = caseCourante - Objectif;
                caseCourante = Objectif - depassement;

            }
            System.err.println("votre lancer " + nbLancers + " vous mène a la case " + caseCourante);
        }
        System.err.println("Il vous aura fallu " + nbLancers + " lancer pour gagner");
        if (caseCourante == Objectif) {
            System.err.println("Vous avez gagné !!!");
        }

        // for (int i = 1; i <= 5; i++) {
        // Random generateur = new Random();
        // int lancer = generateur.nextInt(6) + 1;

        // scoreTotal = lancer + scoreTotal;
        // System.out.println(
        // "Votre lancer " + i + " est égal à :" + lancer + ".Vous êtes a la case : " +
        // scoreTotal);

        // }
        // System.out.println("Ton score est de " + scoreTotal);
        // if (scoreTotal == 20) {
        // System.out.println("Bravo vous êtes bien arrivé a 20 !!");
        // } else
        // System.out.println("Dommage tu as perdu...");
        // nbPartie = nbPartie + 1;
        // }
        // System.out.println("vous avez fait " + nbPartie + " partie.");
    }

}
