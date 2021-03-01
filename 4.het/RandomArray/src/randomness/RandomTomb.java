package randomness;

import java.util.Random;
import java.util.Arrays;


public class RandomTomb {

    private static Random r = new Random();

    static int[] tombGeneral(final int meret) {
        int[] arr = new int[meret];
        for(int i = 0; i < meret; i++) {
            arr[i] = r.nextInt(50) + 1;
        }
        return arr;
    }

    static void tombKiir(final int[] arr) {
        for(int i : arr)
            System.out.println(i);
    }

    static int legnagyobbParos(final int[] arr) {
        int max = arr[0];
        for(int i : arr)
            if(i % 2 == 0 && i > max)
                max = i;
        return max;
    }

    static int negyzetSzamok(final int[] arr) {
        int negyzetCount = 0;
        int s;
        for(int i : arr) {
            s = (int)Math.sqrt(i);
            if((s * s) == i) {
                negyzetCount++;
            }
        }
        return negyzetCount;
    }

    static double[] tombGeneralDouble(final int meret) {
        double[] arr = new double[meret];
        for(int i = 0; i < meret; i++) {
            arr[i] = (r.nextDouble() * (50 - 1) + 1);
        }
        return arr;
    }

    static double mertaniAtlag(final double[] arr) {
        double pr = 1;
        for(double i : arr) {
            pr *= i;
        }
        return Math.pow(pr, 1.0 / arr.length);

    }

    static void rendezettKiir(int[] arr, double[] arr2) {
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i : arr) 
            System.out.println(i);
            
        for(double i : arr2)
            System.out.println(i);
    
    }

    static int binarisKereses(final int[] arr, int key) {
        return Arrays.binarySearch(arr, key);
    }

    static boolean azonossagTomb(final int[] arr1, final int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        final int meret = 10;
        final int[] arr = tombGeneral(meret);
        tombKiir(arr);
        System.out.println("ln szám: " + legnagyobbParos(arr));
        System.out.println("negyzetszám száma: " + negyzetSzamok(arr));

        final double[] arr2 = tombGeneralDouble(meret);
        System.out.println("mertani atlag: " + mertaniAtlag(arr2));
    }
}
