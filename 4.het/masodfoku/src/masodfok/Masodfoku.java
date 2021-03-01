package masodfok;

import java.util.Scanner;

public class Masodfoku {

    static double[] egyenletBeker() {
        Scanner inp = new Scanner(System.in);
        String egynlt;
        String[] szamok;
        double[] arr = new double[3];
        boolean ok;
        do {
            System.out.print("Adj meg egy egyenletet: ");
            egynlt = inp.nextLine();
            szamok = egynlt.split(" ");
            ok = true;
            try {
                for(int i = 0; i < arr.length; i++) {
                    arr[i] = Double.parseDouble(szamok[i]);
                }
            } 
            catch(NumberFormatException e) {
                ok = false;
                System.out.println("Nem helyes szám");
            }
        } while(!ok);

        
        inp.close();
        return arr;
    }

    static double[] masodfoku(final double[] szamok) {
        double d = szamok[1] * szamok[1] - (4 * szamok[0] * szamok[2]);
        double[] eredm = new double[2];
        eredm[0] = (-szamok[1] + Math.sqrt(d)) / (2 * szamok[0]);
        eredm[1] = (-szamok[1] - Math.sqrt(d)) / (2 * szamok[0]);
        return eredm;
    }

    public static void main(String[] args) {
        final double[] szamok = egyenletBeker();
        final double[] eredmeny = masodfoku(szamok);
        System.out.println(eredmeny[0] + " " + eredmeny[1] );
    }
}
