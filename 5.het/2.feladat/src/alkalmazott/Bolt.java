package alkalmazott;

public class Bolt {
    private int letszam;
    private Alkalmazott[] boltiAlkalmazottak;

    public Bolt(int letszam) {
        this.letszam = letszam;
        this.boltiAlkalmazottak = new Alkalmazott[letszam];
        feltolt();
    }

    private void feltolt() {
        for (int i = 0; i < boltiAlkalmazottak.length; i++) {
            boltiAlkalmazottak[i] = new Alkalmazott("bela " + (i + 1) , i + 10000);
        }
    }

    public int getLetszam() {
        return letszam;
    }

    public Alkalmazott[] getBoltiAlkalmazottak() {
        return boltiAlkalmazottak;
    }

    private static double altagFizetes(Alkalmazott[] alk) {
        int sum = 0;
        for (Alkalmazott alkalmazott : alk) {
            sum += alkalmazott.getSalary();
        }
        return (double)sum / alk.length;
    }

    private static int sjaOsszeg(Alkalmazott[] alk) {
        int sum = 0;
        for (Alkalmazott alkalmazott : alk) {
            sum += alkalmazott.getSJA();
        }

        return sum;
    }

    private static Alkalmazott legnagyobbFizetes(Alkalmazott[] a) {
        Alkalmazott max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max.nagyobbE(a[i])) {
                max = a[i];
            }
        }
        return max;
    }



}
