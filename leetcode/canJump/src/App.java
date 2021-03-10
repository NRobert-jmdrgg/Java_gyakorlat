import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        char[] c = {'H', 'e', 'l', 'l', 'o'};
        reverseString(c);
        System.out.println(Arrays.toString(c));
    }

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        char c;
        while (i <= j) {
            c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
            j--; 
        }
    }
}
