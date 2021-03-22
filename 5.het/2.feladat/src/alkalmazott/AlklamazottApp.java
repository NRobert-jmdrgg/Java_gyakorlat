package alkalmazott;
/**
 * 4.1.a feladat.
 */
public class AlklamazottApp {
    public static void main(String[] args) {
        Alkalmazott a = new Alkalmazott("Pista", 400000);
        
        System.out.println(a);
        a.increaseSalary(40);
        System.out.println(a);
    }
}
