package TP1;

import java.util.Scanner;

public class Exerice6 {
    Exerice6() {

        String numbers = "0123456789";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String lettersMaj = letters.toUpperCase();
        String special = "!@#$%^&*_+";
        String all = numbers + letters + lettersMaj + special;
        String password = "";

        int PasswordSize = askSize();
        // avoir un mot de passe avec au moins une lettre minuscule, une lettre majuscule, un chiffre et un caractère spécial
        password += numbers.charAt((int) (Math.random() * numbers.length()));
        password += letters.charAt((int) (Math.random() * letters.length()));
        password += lettersMaj.charAt((int) (Math.random() * lettersMaj.length()));
        password += special.charAt((int) (Math.random() * special.length()));

        // remplir le reste avec des caractères aléatoires
        for (int i = 0; i < PasswordSize - 4; i++) {
            password += all.charAt((int) (Math.random() * all.length()));
        }

        // mélanger les caractères
        password = shuffle(password);

        System.out.println(password);
    }

    public char chooseRandom(String string) {
        int random = (int) (Math.random() * string.length());
        return string.charAt(random);
    }

    public String shuffle(String string) {
        String shuffled = "";
        while (string.length() > 0) {
            int random = (int) (Math.random() * string.length());
            shuffled += string.charAt(random);
            string = string.substring(0, random) + string.substring(random + 1);
        }
        return shuffled;
    }

    public int askSize() {
        System.out.println("Quelle taille de mot de passe voulez-vous? ( minimum 8 )");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size < 8) {
            System.out.println("La taille doit être supérieur à 8");
            return askSize();
        }
        return size;
    }
}
