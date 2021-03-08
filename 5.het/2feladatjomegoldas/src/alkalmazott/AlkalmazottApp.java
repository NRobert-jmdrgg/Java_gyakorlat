package alkalmazott;

public class AlkalmazottApp {
    public static void main(String[] args) {
        Alkalmazott a = new Alkalmazott("Karcsi", 1000000);
        System.out.println(a.toString());
        System.out.println(Alkalmazott.getEmployeeCount());
    }
}
