package TP1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercice2 {

    public void run() {
        ArrayList<Integer> notes = new ArrayList<>();

        boolean run = true;

        do {
            System.out.println("Saisir une note entre 0 et 20 (<0 pour sortir)");
            Scanner sc = new Scanner(System.in);
            int choix = sc.nextInt();

            if (choix < 0 || choix > 20) {
                System.out.println("sortie...");
                run = false;
            } else {
                notes.add(choix);
            }
        } while (run);

        System.out.println("Toutes les valeurs" + notes);

        int[] count = new int[21];
        for (int i = 0; i < notes.size(); i++) {
            count[notes.get(i)]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println("la note " + i + " a été attribuée " + count[i] + " fois");
            }
        }



        System.out.println("Minimum " + Collections.min(notes));
        System.out.println("Maximum " + Collections.max(notes));
    }

}
