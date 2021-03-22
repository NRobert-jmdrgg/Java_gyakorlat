package alkalmazott;
/**
 * 4.1.a feladat.
 */
public class AlklamazottApp {
    public static void main(String[] args) {
        Alkalmazott[] alkalmazottak = new Alkalmazott[5];
        
        kiirAlkalmazottak(alkalmazottak);
        
    }

    

    private static void kiirAlkalmazottak(Alkalmazott[] alk) {
        for (Alkalmazott alkalmazott : alk) {
            System.out.println(alkalmazott);
        }
    }

    
}
