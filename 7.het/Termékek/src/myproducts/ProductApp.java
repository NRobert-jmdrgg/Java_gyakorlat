package myproducts;

public class ProductApp {
    public static void main(String[] args) {
        Product a = new Product("csoki", 300, 10);
        Bread b = new Bread("Barna", 400, 14, 10);

        System.out.println(a);
        System.out.println(b);
    }
}
