package TP1;

import java.util.Scanner;

public class Exercice5  {
    int[] tab;
    public Exercice5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la taille du tableau");
        int taille = sc.nextInt();
        this.tab = new int[taille];
        for (int i = 0; i < taille; i++) {
            System.out.println("Entrer la valeur de l'element "+i);
            this.tab[i] = sc.nextInt();
        }

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
