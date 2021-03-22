
package alkalmazott;


public class Kimutatasok {
    private Bolt bolt = new Bolt(5);
    private Alkalmazott[] alkalmazottak = bolt.getBoltiAlkalmazottak();


    private double altagFizetes() {
        int sum = 0;
        for (Alkalmazott alkalmazott : alkalmazottak) {
            sum += alkalmazott.getSalary();
        }
        return (double)sum / alk.length;
    }

    private int sjaOsszeg() {
        int sum = 0;
        for (Alkalmazott alkalmazott : alkalmazottak) {
            sum += alkalmazott.getSJA();
        }

        return sum;
    }

    private Alkalmazott legnagyobbFizetes() {
        Alkalmazott max = alkalmazottak[0];
        for (int i = 1; i < alkalmazottak.length; i++) {
            if (max.nagyobbE(alkalmazottak[i])) {
                max = alkalmazottak[i];
            }
        }
        return max;
    }



}
