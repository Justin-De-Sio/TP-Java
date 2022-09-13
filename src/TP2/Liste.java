package TP2;

import java.util.ArrayList;

public class Liste {
    ArrayList<Object> listes;
    int position;

    public Liste(ArrayList<Object> listes) {
        this.listes = listes;
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
        Object element = listes.get(position);
        listes.remove(position);
        return element;
    }

    public Object suivant() {
        Object element = listes.get(position);
        position++;
        return element;
    }
}
