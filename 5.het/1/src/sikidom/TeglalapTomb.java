package sikidom;

import java.util.Random;

public class TeglalapTomb {
    
    private static final int SIZE = 10;
    private Teglalap[] teglalapArray = new Teglalap[SIZE];



    private Teglalap[] randomArray(Random r, int size) {
        Teglalap[] t = new Teglalap[size];
        for(int i = 0; i < size; i++) {
            t[i] = new Teglalap(r.nextInt(8) + 2, r.nextInt(8) + 2);
        }
        return t;
    }
}
