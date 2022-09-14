package TP1;

import java.util.ArrayList;
import java.util.Random;

public class Exercice3 {
    public void tirage(){
        int min = 1;
        int max = 49;

        int[] tab = new int[6];

        Random random = new Random();
        int randomNumber = random.nextInt(min + max) + min;
        for (int i = 0; i < tab.length; i++) {
            System.out.println(i);
        }


    }
}
