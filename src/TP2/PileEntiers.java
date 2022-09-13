package TP2;

public class PileEntiers extends Pile {

        public PileEntiers(Liste maListe, String PileName) {
            super(maListe, PileName);
        }

        public void empiler(Integer element) {
            super.empiler(element);
        }
        public Integer depiler() {
            return (Integer) super.depiler();
        }

}
