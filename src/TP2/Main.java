package TP2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PileEntiers P1 = new PileEntiers( "Pile 1");
        PileEntiers P2 = new PileEntiers( "Pile 2");
        PileEntiers P3 = new PileEntiers( "Pile 3");
        for (int i = 0; i < 5; i++) {
            Integer element = (int) (Math.random() * 10);
                P1.empiler(element);
                if(element % 2 == 0){
                    P2.empiler(element);
                }
                else{
                    P3.empiler(element);
                }
        }

    }
}
