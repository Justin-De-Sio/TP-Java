package TP1;
public class Exercice1 {
    public static void main(String args[]) {
/*
Identifiez l’erreur 1 et corrigez
*/
        for (int i = 0; i < 5; i++)
            System.out.print(i + ", ");
        System.out.print("\n");
/*
Identifiez l’erreur 2 et corrigez
*/
        float a = 3.0F;
        double b = 4;
        float cF;
        b = Math.sqrt(a * a + b * b);
        System.out.println("c = " + b);
/*
Identifiez l’erreur 3 et corrigez
*/
        byte i1 = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double resultat = (f * i1) + (i / c) - (d * s);
        System.out.print((f * i1) + " + " + (i / c) + " - " + (d * s));
        System.out.println(" = " + resultat);
        byte b2 = 10;
        int b3 = b2 * i1;
        System.out.println("b3 = " + b3);
    }
}