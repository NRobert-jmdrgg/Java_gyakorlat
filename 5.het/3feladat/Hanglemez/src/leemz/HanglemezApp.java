package leemz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HanglemezApp {
    private static Scanner s = new Scanner(System.in);
    
    private static int beolvas() {
        InputStreamReader instream = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(instream);
        String str;
        int n = 0;
        boolean b;
        do {
            b = true;
            try {
                System.out.println("Adj meg a szamot: ");
                str = in.readLine();
                n = Integer.parseInt(str);
            } catch(Exception e) {
                System.out.println("Nem egy szam");
                b = false;
            }
        } while(!b);
        return n;
    }

    public static Hanglemez hanglemezBeker() {
        String eloado;
        String cim;
        System.out.println("Add meg az eloadot: ");
        eloado = s.nextLine();
        System.out.println("Add meg a cimet: ");
        cim = s.nextLine();
        int a = beolvas();
        return new Hanglemez(eloado, cim, a);
    }

    public static void leghosszabbLemez(Hanglemez[] harr) {
        Hanglemez leghosszabb = harr[0];
        for(Hanglemez h : harr) {
            if(h.getHossz() > leghosszabb.getHossz()) {
                leghosszabb = h;
            }
        }
        System.out.println("A leghosszabb lemez: " + leghosszabb.toString());
    }

    public static void beolvasottKiir(Hanglemez[] harr) {
        System.out.println("Adj meg egy eloadot: ");
        String str = s.nextLine();
        for(Hanglemez h : harr) {
            if(h.getEloado().equals(str)) {
                System.out.println(h.toString());
            }
        }
    }
    
    public static void main(String[] args) {
        int meret = beolvas();

        Hanglemez[] h = new Hanglemez[meret];
        for(int i = 0; i < meret; i++) {
            h[i] = hanglemezBeker();
        }
        leghosszabbLemez(h);
        beolvasottKiir(h);
        

    } 
}
