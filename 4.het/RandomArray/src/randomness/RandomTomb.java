package randomness;

import java.util.Random;

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
    public static void main(String[] args) {
        final int meret = 10;
        final int[] arr = tombGeneral(meret);
        tombKiir(arr);
        System.out.println("ln szám: " + legnagyobbParos(arr));
        System.out.println("negyzetszám száma: " + negyzetSzamok(arr));
    }
}
