package pi;

public class PiKiszamit {
    public static void main(String[] args) {
        double pi = 0;
        double sz = -1;
        for(int i = 1; i < 2000; i += 2) {
            sz *= -1;
            pi += sz / i;
        }

        System.out.println(pi * 4);
    }
}
