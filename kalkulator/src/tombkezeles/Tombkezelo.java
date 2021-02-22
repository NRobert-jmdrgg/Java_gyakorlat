package tombkezeles;

import java.util.Scanner;

public class Tombkezelo {
    
    static int beker() {
        int a;
        Scanner s = new Scanner(System.in);
        boolean ok;
        do {
            ok = true;
            System.out.println("Adj meg egy egesz szamot: ");
            if(!s.hasNextInt()) {
                ok = false; 
                System.out.println("Hibas input");
                s.next();
            }
            a = s.nextInt();  
        } while(!ok);
        s.close();
        return a;
    }
    public static void main(String[] args) {
        int a = beker();
        System.out.println(a);
    }
}
