package muka;

import java.util.Random;

public class Munkahely {
    public static void main(String[] args) {
        final int meret = 5;
        final String[] nevek = {"Aladár", "Bence", "Cecil", "Dávid", "Elemér"};
        Random r = new Random();
        Alkalmazott[] alkalmazottak = new Alkalmazott[meret];

        for(int i = 0; i < meret; i++) {
            alkalmazottak[i] = new Alkalmazott(nevek[i], r.nextInt(1000000 - 470000) + 470000);
        }
    }

    
}
