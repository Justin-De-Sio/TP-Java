package TP2;

import java.util.ArrayList;

public class Pile {

    Liste maListe;
    String PileName;

    public Pile( String PileName) {
        this.maListe = new Liste(new ArrayList<Object>());
        this.PileName = PileName;

    }

    public void empiler(Object element) {
        maListe.dernier();
        maListe.ajouter(element);
        System.out.println("Empiler " + element + " dans la pile " + this.PileName);
    }

    public Object depiler() {
        maListe.dernier();
        Object element = maListe.supprimer();
        System.out.println("Depiler " + element + " dans la pile " + this.PileName);
        return element;

    }

}
