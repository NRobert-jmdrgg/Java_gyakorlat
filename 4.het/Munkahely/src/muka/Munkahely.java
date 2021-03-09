package muka;

import java.util.Random;

public class Munkahely {
    private static void legnagyobbFizetesselRendelkezo(final Alkalmazott[] alk) {
        int maxind = 0;
        for(int i = 0 ; i < alk.length; i++) {
            if(alk[i].getSalary() > alk[maxind].getSalary()) {
                maxind = i;
            }
        }
        System.out.println(alk[maxind].getName() + " -nak van a legnagyobb fizetese");
    }

    private static int 
    intervallumbaEsoFizetesekSzama(final int upper,final int lower, final Alkalmazott[] alk) {
        int count = 0;
        for(Alkalmazott a : alk) 
            if(a.salaryBounds(upper, lower)) 
                count++;
        return count;
    }


    private static double atlagFizetes(final Alkalmazott[] alk) {
        double atlag = 0.0;
        for(Alkalmazott a : alk) {
            atlag += a.getSalary();
        }
        return atlag / alk.length;
    }

    private static double befizetendoAdo(final Alkalmazott[] alk) {
        double ado = 0;
        for(Alkalmazott a : alk) {
            ado += a.tax();
        }
        return ado;
    }

    private static void kiirAlkalmazottak(final Alkalmazott[] alk) {
        for(Alkalmazott a : alk)
            System.out.println(a.toString());
    }

    public static void main(String[] args) {
        final int meret = 5;
        final String[] nevek = {"Aladár", "Bence", "Cecil", "Dávid", "Elemér"};
        Random r = new Random();
        Alkalmazott[] alkalmazottak = new Alkalmazott[meret];

        for(int i = 0; i < meret; i++) {
            alkalmazottak[i] = new Alkalmazott(nevek[i], r.nextInt(1000000 - 470000) + 470000);
        }

        kiirAlkalmazottak(alkalmazottak);

        legnagyobbFizetesselRendelkezo(alkalmazottak);

        System.out.println("Intervallumba eso fizetesek szama: " + 
        intervallumbaEsoFizetesekSzama(500000, 100000, alkalmazottak));
        System.out.println("Atlagfizetes: " + atlagFizetes(alkalmazottak));
        System.out.println("Osszes befezeto ado: " + befizetendoAdo(alkalmazottak));

    }


}
