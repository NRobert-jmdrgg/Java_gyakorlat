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
        int ev;
        String honap;
        int nap;
        
        System.out.println("Add meg az alkalmazott nevet: ");
        nev = s.nextLine();
        System.out.println("Add meg az evet: ");
        ev = s.nextInt();
        s.nextLine();
        System.out.println("Add meg a honapot: ");
        honap = s.nextLine();
        System.out.println("Add meg az napot: ");
        nap = s.nextInt();
        s.nextLine();
        

        return new Alkalmazott(nev, ev, honap, nap);
        
    }

    public static void alkalmazottakKiir(Alkalmazott[] alk) {
        for (Alkalmazott a : alk) {
            System.out.println(a.toString());
        }
    }

    public static void otEvNyugdijigKiir(Alkalmazott[] alk) {
        for (Alkalmazott a : alk) {
            if (a.evekNyugdijig() == 5) {
                System.out.println(a.toString());
            }
        }
    }

    public static void atlagnalTobbKiir(Alkalmazott[] alk) {
        System.out.println("Atlagnal tobb ev nyugdijig");
        double atlag = 0;
        for (Alkalmazott a : alk) {
            atlag += a.evekNyugdijig();
        }
        atlag /= alk.length;
        System.out.println("Atlag: " + atlag);
        for (Alkalmazott a : alk) {
            if (a.evekNyugdijig() > atlag) {
                System.out.println(a.toString());
            }
        }
    }

    public static void rendezHatralevoEvekAlapjan(Alkalmazott[] alk) {
        for (int i = 0; i < alk.length; i++) {
            int minindex = i;
            for (int j = i + 1; j < alk.length; j++) {
                if (alk[j].evekNyugdijig() < alk[minindex].evekNyugdijig()) {
                    minindex = j;
                }
            }

            if (minindex != i) {
                Alkalmazott temp = alk[i];
                alk[i] = alk[minindex];
                alk[minindex] = temp;
            }
        }
        
    }

    public static void rendezHatralevoEvekAlapjanCsokkeno(Alkalmazott[] alk) {
        for (int i = 0; i < alk.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < alk.length; j++) {
                if (alk[j].evekNyugdijig() > alk[maxIndex].evekNyugdijig()) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                Alkalmazott temp = alk[i];
                alk[i] = alk[maxIndex];
                alk[maxIndex] = temp;
            }
        }
        
    }

    public static void main(String[] args) {
        System.out.println("Add meg az alkalmazottak szamat : ");        
        int n = beolvas();

        Alkalmazott[] alkalmazottak = new Alkalmazott[n];

        for (int i = 0; i < n; i++) {
            alkalmazottak[i] = alkalmazottBeolvas();
        }

        alkalmazottakKiir(alkalmazottak);

        alkalmazottakKiir(alkalmazottak);

        otEvNyugdijigKiir(alkalmazottak);

        atlagnalTobbKiir(alkalmazottak);
    }
}
