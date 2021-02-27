public class App {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        if(n < 1) return false;
        for(long i = 1; ;i = i << 1) {
            if(i == n) return true;
            if(i > n) return false;
        } 

    }
}
