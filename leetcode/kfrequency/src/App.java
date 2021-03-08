

import java.util.HashMap;

import java.util.Map;





public class App {

    
    public static void main(String[] args) {
        int[] arr = {-1,-1};
        int[] result = topKFrequent(arr, 1);
        for(int i : result) {
            System.out.println(i);
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        
        for(int i : nums) {
            if(frequency.containsKey(i)) {
                frequency.put(i, frequency.get(i) + 1);
            } else {
                frequency.put(i, 1);
            }
        }

        int[] r = new int[k];
        int max;
        int maxKey = 0;
        
        for(int i = 0; i < k; i++) {
            max = Integer.MIN_VALUE;
            for(Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
                if(entry.getValue() > max) {
                    max = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            frequency.remove(maxKey);
            r[i] = maxKey;
        }
        
        
        return r;
    }
}
