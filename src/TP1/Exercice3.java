package TP1;

import java.util.ArrayList;
import java.util.Random;

public class Exercice3 {
    public void tirage() {
        int min = 1;
        int max = 49;
        int[] loto = new int[6];

        Random random = new Random();

        for (int i = 0; i < loto.length; i++) {
            int randomNumber = random.nextInt(min + max) + min;
            if (exist(loto,randomNumber)) {
                i--;
            } else {
                loto[i] = randomNumber;
            }
        }
        System.out.println("Les numéros gagnants sont :");
        for (int number : loto) {
            System.out.println(number);
        }

    }

    //TODO exo 3,4,6,7
    public boolean exist(int[] list, int number) {
        for (int element : list) {
            if (element == number)
                return true;
        }
        return false;
    }
}
