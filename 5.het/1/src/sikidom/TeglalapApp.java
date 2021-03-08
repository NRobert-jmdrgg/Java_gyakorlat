package sikidom;

public class TeglalapApp {
    public static void main(String[] args) {
        Teglalap a = new Teglalap(5, 5);
        Teglalap b = new Teglalap(5, 7);
        Teglalap c = a;

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

        a.setBothSides(6);
        System.out.println(a.toString());

        a = b;
        System.out.println(a.toString());

        System.out.println(a.isSameSizeAs(b));
        System.out.println(a.isSameSizeAs(c));

    }
}
