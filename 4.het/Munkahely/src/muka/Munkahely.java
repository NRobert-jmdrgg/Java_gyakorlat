package muka;

import java.util.Random;

public class Munkahely {
    public static void legnagyobbFizetesselRendelkezo(final Alkalmazott[] alk) {
        int maxind = 0;
        for(int i = 0 ; i < alk.length; i++) {
            if(alk[i].getSalary() > alk[maxind].getSalary()) {
                maxind = i;
            }
        }
        System.out.println(alk[maxind].getName() + " -nak van a legnagyobb fizetese");
    }
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
