import java.util.HashMap;
public class App {
    public static void main(String[] args) {
        int[] arr = {0,2,1,-6,6,-7,9,1,2,0,1}; 
        System.out.println(canThreePartsEqualSum(arr));

    }

    public static boolean canThreePartsEqualSum(int[] arr) {
        int b = 0;
        
        int i = 1;
        int j = arr.length - 2;
        int a = arr[0];
        int c = arr[arr.length - 1];

        while(a != c) {
            a += arr[i];
            c += arr[j];
            i++;
            j--;
        }

        for( ; i <= j; i++) {
            b += arr[i];
        }
        
        return (b == a);



    }
}
