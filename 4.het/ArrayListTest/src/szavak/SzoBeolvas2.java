package szavak;

import java.util.Scanner;
import java.util.ArrayList;

public class SzoBeolvas2 {
    private static Scanner input = new Scanner(System.in); 

    static ArrayList<String> szavakatEltarol() {
        ArrayList<String> szavak = new ArrayList<>();
        System.out.println("Add meg a szavakat: (üres szora leall a program)");

        String szo;
        do {
            szo = input.nextLine();
            szavak.add(szo);
        } while(!szo.isEmpty());
        szavak.remove(szavak.size() - 1);
        

        return szavak;
    }

    static void kiir(ArrayList<String> arr) {
        System.out.print("Kiiras: ");
        for(String s : arr) 
            System.out.println(s);
    }
    public static void main(String[] args) {   
        ArrayList<String> szavak = szavakatEltarol();
        kiir(szavak);
    }
}
