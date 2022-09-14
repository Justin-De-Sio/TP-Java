package TP1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercice2 {

    public void run() {
        ArrayList<Integer> notes = new ArrayList<>();

        boolean run = true;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Saisir une note entre 0 et 20 (<0 pour sortir)");
            int choix = sc.nextInt();

            if (choix < 0 || choix > 20) {
                System.out.println("sortie...");
                run = false;
            } else {
                notes.add(choix);
            }
        } while (run);
        sc.close();
        System.out.println("Toutes les valeurs" + notes);

        int[] count = new int[21];
        for (Integer note : notes) {
            count[note]++;
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
