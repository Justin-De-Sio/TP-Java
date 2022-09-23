package TP1;

import java.util.Scanner;

public class Exercice6 {
    Exercice6() {

        String numbers = "0123456789";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String lettersMaj = letters.toUpperCase();
        String special = "!@#$%^&*_+";
        String all = numbers + letters + lettersMaj + special;
        StringBuilder password = new StringBuilder();

        int PasswordSize = askSize();
        // avoir un mot de passe avec au moins une lettre minuscule, une lettre majuscule, un chiffre et un caractère spécial
        password.append(numbers.charAt((int) (Math.random() * numbers.length())));
        password.append(letters.charAt((int) (Math.random() * letters.length())));
        password.append(lettersMaj.charAt((int) (Math.random() * lettersMaj.length())));
        password.append(special.charAt((int) (Math.random() * special.length())));

        // remplir le reste avec des caractères aléatoires
        for (int i = 0; i < PasswordSize - 4; i++) {
            password.append(all.charAt((int) (Math.random() * all.length())));
        }

        // mélanger les caractères
        password = new StringBuilder(shuffle(password.toString()));

        System.out.println(password);
    }

    public char chooseRandom(String string) {
        int random = (int) (Math.random() * string.length());
        return string.charAt(random);
    }

    public String shuffle(String string) {
        StringBuilder shuffled = new StringBuilder();
        while (string.length() > 0) {
            int random = (int) (Math.random() * string.length());
            shuffled.append(string.charAt(random));
            string = string.substring(0, random) + string.substring(random + 1);
        }
        return shuffled.toString();
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
