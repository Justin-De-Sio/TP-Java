package TP1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Selectionnez l'exercice!");
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
        switch (choix){
            case 1:
                System.out.println("exerice 1:");
                break;
            case 2:
                System.out.println("exerice 2:");
                Exercice2 exercice2 = new Exercice2();
                exercice2.run();
                break;
        }
    }
}