public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fib(i));    
        }
        
    }

    public static int fib(int n) {
        double r = (1 + Math.sqrt(5)) / 2;
        double fib = (Math.pow(r, n) - Math.pow(1 - r, n)) / Math.sqrt(5);
        return (int)Math.round(fib);
    }
}
