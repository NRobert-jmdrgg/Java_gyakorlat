package alkalmazott;
/**
 * 4.1.a feladat.
 */
public class AlklamazottApp {
    public static void main(String[] args) {
        Alkalmazott[] alkalmazottak = new Alkalmazott[5];
        feltolt(alkalmazottak);
        kiirAlkalmazottak(alkalmazottak);
    }

    public static void feltolt(Alkalmazott[] alk) {
        for (int i = 0; i < alk.length; i++) {
            alk[i] = new Alkalmazott("bela " + (i + 1) , i + 10000);
        }
    }

    public static void kiirAlkalmazottak(Alkalmazott[] alk) {
        for (Alkalmazott alkalmazott : alk) {
            System.out.println(alkalmazott);
        }
    }

    public static double altagFizetes(Alkalmazott[] alk) {
        int sum = 0;
        for (Alkalmazott alkalmazott : alk) {
            sum += alkalmazott.getSalary();
        }
        return (double)sum / alk.length;
    }
}
