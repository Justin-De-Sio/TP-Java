package TP1;

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
            case 3:
                System.out.println("exercice 3:");
                Exercice3 exercice3 = new Exercice3();
                exercice3.tirage();
                break;
            case 4:
                System.out.println("exercice 4:");
                Exercice4 exercice4 = new Exercice4();
                exercice4.afficherListe();
                break;
            case 5:
                System.out.println("exercice 5:");
                Exercice5 exercice5 = new Exercice5();
                exercice5.afficherListe();
                break;
            case 6:
                System.out.println("exercice 6:");
                Exercice6 exercice6 = new Exercice6();
                break;
            default:
                System.out.println("exercice non trouvé");
                break;

        }
    }
}