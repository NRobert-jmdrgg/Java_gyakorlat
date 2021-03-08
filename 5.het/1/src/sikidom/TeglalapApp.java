package sikidom;

import java.util.Random;
import java.util.Scanner;

public class TeglalapApp {

    private static Random r = new Random();
    private static Scanner s = new Scanner(System.in);

    private static Teglalap[] teglalapRandomArray(final int size) {
        Teglalap[] t = new Teglalap[size];
        for(int i = 0; i < size; i++) {
            t[i] = new Teglalap(r.nextInt(8) + 2, r.nextInt(8) + 2);
        }
        return t;
    }

    private static Teglalap smallest(final Teglalap[] tarray) {
        Teglalap min = tarray[0];
        for(Teglalap t : tarray) {
            if(!t.biggerThan(min)) {
                min = t;
            }
        }
        return min;
    }

    private static int numberOfBiggerThanThis(Teglalap[] tarray, Teglalap t) {
        int count = 0;
        for(Teglalap a : tarray) {
            if(a.biggerThan(t)) {
                count++;
            }
        }
        return count;
    }

    private static int[] input() {
        String str;
        String[] szamok = new String[2];
        int[] arr = new int[2];
        boolean ok = true;
        do {
            System.out.println("Add meg a teglalap oldalait: ");
            str = s.nextLine();
            szamok = str.split(" ");
            
            try {
                for(int i = 0; i < 2; i++) {
                    arr[i] = Integer.parseInt(szamok[i]);
                    if(arr[i] < 1) {
                        ok = false;
                        System.out.println("1 nél nagyobb szám kell");
                    }
                }
            } catch(NumberFormatException e) {
                ok = false;
                System.out.println("Rossz szám");
            }

        } while(!ok);
        s.close();  
        return arr;
    }

    private static int firstSameIndex(Teglalap[] tarray, Teglalap t) {
        for(int i = 0; i < tarray.length; i++) {
            if(tarray[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Teglalap a = new Teglalap(5, 5);
        Teglalap b = new Teglalap(5, 7);
        Teglalap c = a;

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

        a.setBothSides(6);
        System.out.println(a.toString());

        a = b;
        System.out.println(a.toString());

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        Teglalap[] tarray = teglalapRandomArray(10);
        System.out.println("legkissebb: " + smallest(tarray).toString());

        int[] ar = input();
        Teglalap t = new Teglalap(ar[0], ar[1]);
        System.out.println(numberOfBiggerThanThis(tarray, t));

        int i = firstSameIndex(tarray, t);
        if(i != -1) {
            System.out.println("indexen " + i + " lévő téglalap ugyanaz");
        }


    }

    
}
