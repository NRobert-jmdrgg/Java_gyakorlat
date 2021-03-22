package euler;

public class EulerSzam {

	public static void main(String[] args) {
        double e = 0.0;
        for(int i = 0; i <= 11; i++) 
            e += 1.0 / factorial(i);
        System.out.println(e);
    }

    private static int factorial(int a) {
        int f = 1;
        for(int i = 2; i <= a; i++) f *= i;
        return f;
    }
}
