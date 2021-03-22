package testtomeg;

import java.util.Scanner;

public class TestTomeg {
    
    private static Scanner s = new Scanner(System.in);
    
    //csak double intre ugyis atkonvertalja
    private static double bekerSzam() {
        double num;
        boolean ok;
        do {
            ok = true;
            while(!s.hasNextDouble()) {
                System.out.println("Nem szám");
                ok = false;
                s.next(); //elnyeli az entert a streambol
            }
            num = s.nextDouble();
        } while(!ok);
        return num;
    }

    private static Szemely beolvasSzemely() {
        
        
        String nev;
        double suly;
        int magassag;

        System.out.println("Add meg a szemely nevet: ");
        nev = s.nextLine();
        System.out.println("Add meg a sulyt: ");
        suly = bekerSzam();
        System.out.println("Add meg a magassagot: ");
        magassag = (int)bekerSzam();

        
        return new Szemely(nev,suly, magassag);
    }
    public static void main(String[] args) {
        Szemely a = beolvasSzemely();
        System.out.println(a.toString());
        //Setter
        a.setMagassag(185);        
        //getter
        System.out.println(a.getMagassag());
    }
}
