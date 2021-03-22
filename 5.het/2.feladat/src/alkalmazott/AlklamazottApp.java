package alkalmazott;
/**
 * 4.1.a feladat.
 */
public class AlklamazottApp {
    public static void main(String[] args) {
        Alkalmazott[] alkalmazottak = new Alkalmazott[5];
        feltolt(alkalmazottak);
        kiirAlkalmazottak(alkalmazottak);
        System.out.println(altagFizetes(alkalmazottak));
        System.out.println(legnagyobbFizetes(alkalmazottak));
        System.out.println(sjaOsszeg(alkalmazottak));
    }

    private static void feltolt(Alkalmazott[] alk) {
        for (int i = 0; i < alk.length; i++) {
            alk[i] = new Alkalmazott("bela " + (i + 1) , i + 10000);
        }
    }

    private static void kiirAlkalmazottak(Alkalmazott[] alk) {
        for (Alkalmazott alkalmazott : alk) {
            System.out.println(alkalmazott);
        }
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
