package TP1;

import java.util.Random;

public class Exercice4 {
    int[] tab;

    public Exercice4() {
        this.tab = new int[15];
        for (int i = 0; i < 15; i++) {
            this.tab[i] = genererNombreAleatoire(-1, 5);
        }

    }

    public int genererNombreAleatoire(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    public void afficherListe() {
        for (int i = 0; i < tab.length; i++) {
            if (isPremier(i)) {
                System.out.println(tab[i] + afficherEtoile(tab[i]));
            }
        }
    }

    public boolean isPremier(int i) {
        for (int j = 0; j < i; j++) {
            if (tab[i] == tab[j]) {
                return false;
            }
        }
        return true;
    }

    public String afficherEtoile(int number) {
        StringBuilder etoile = new StringBuilder();
        for (int element : tab) {
            if (number == element) {
                etoile.append("*");
            }
        }
        return etoile.toString();
    }


}
