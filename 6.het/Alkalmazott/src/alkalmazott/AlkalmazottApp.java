package alkalmazott;

import java.util.Scanner;

public class AlkalmazottApp {

    private static Scanner s = new Scanner(System.in);

    private static int beolvas() {
        int a;
        while (!s.hasNextInt()) {
            s.next();
            System.out.println("Nem szam");
        }
        a = s.nextInt();
        s.nextLine();
        return a;
    }

    private static Alkalmazott alkalmazottBeolvas() {
        
        
        String nev;
        int eletkor;
        int fizetes; 
        System.out.println("Add meg az alkalmazott nevet: ");
        nev = s.nextLine();
        System.out.println("Add meg az eletkort: ");
        eletkor = s.nextInt();
        s.nextLine();
        System.out.println("Add meg a fizetest: ");
        fizetes = s.nextInt();
        s.nextLine();

        return new Alkalmazott(nev, eletkor, fizetes);
        
    }
    public static void main(String[] args) {
        System.out.println("Add meg az alkalmazottak szamat : ");        
        int n = beolvas();

        Alkalmazott[] alkalmazottak = new Alkalmazott[n];

        for (int i = 0; i < n; i++) {
            alkalmazottak[i] = alkalmazottBeolvas();
        }

        
    }
}
