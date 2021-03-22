package myproducts;

public class ProductApp {
    public static void main(String[] args) {
        Product a = new Product("csoki", 300, 10);
        Bread b = new Bread("Barna", 400, 14, 0.75);

        System.out.println(a);
        System.out.println(b);

        System.out.println(a.arOsszehasonlit(b));

        Product product2 = new Bread("Feher", 300, 10, 1);


    }

    
}
