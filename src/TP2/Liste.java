package TP2;

import java.util.ArrayList;

public class Liste {
    ArrayList<Object> listes;
    int position;

    public Liste() {
        this.listes = new ArrayList<>();
        this.position = 0;
    }


    public void dernier() {
        this.position = listes.size() - 1;
    }

    public void premier() {
        this.position = 0;
    }

    public void ajouter(Object element) {
        listes.add(element);
    }


    public Object supprimer() {
        try  {
            Object element = listes.get(this.position);
            listes.remove(this.position);
            return element;
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
            return null;
        }

    }

    public Object suivant() {
        try {
            Object element = listes.get(this.position);
            this.position++;
            return element;
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
            return null;
        }
    }
}
