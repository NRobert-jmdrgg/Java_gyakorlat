package learn;

import java.util.*;




public class Collect {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            a.add(i);
        }
        Iterator<Integer> it = a.iterator();
        while(it.hasNext()) {
            a.remove(it.next());
        }
    }

    
}
