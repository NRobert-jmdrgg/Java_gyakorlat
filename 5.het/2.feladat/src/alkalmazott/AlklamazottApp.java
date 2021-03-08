package alkalmazott;
/**
 * 4.1.a feladat.
 */
public class AlklamazottApp {
    public static void main(String[] args) {
        Alkalmazott a = new Alkalmazott();
        a.name = "Pista";
        a.salary = 100000;
        System.out.println(a.toString());
        a.increaseSalary(40);
        System.out.println(a.toString());
    }
}
