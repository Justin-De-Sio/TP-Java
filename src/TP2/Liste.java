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
        if (!listes.isEmpty()) {
            Object element = listes.get(this.position);
            listes.remove(this.position);
            return element;
        }else{
            System.out.println("La liste est vide");
            return null;
        }


    }

    public Object suivant() {
        if(this.position < listes.size() - 1){
            Object element = listes.get(this.position);
            this.position++;
            return element;
        } else {
            System.out.println("Vous etes a la fin de la liste");
            return null;
        }
    }
}
