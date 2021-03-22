package alkalmazott;

public class Bolt {
    private int letszam;
    private Alkalmazott[] boltiAlkalmazottak;

    public Bolt(int letszam) {
        this.letszam = letszam;
        this.boltiAlkalmazottak = new Alkalmazott[letszam];
    }

    private static void feltolt(Alkalmazott[] alk) {
        for (int i = 0; i < alk.length; i++) {
            alk[i] = new Alkalmazott("bela " + (i + 1) , i + 10000);
        }
    }
}
