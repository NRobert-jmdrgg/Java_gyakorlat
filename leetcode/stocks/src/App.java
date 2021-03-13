import java.util.*;

public class App {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));   
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int i : nums) {
            if (!numbers.contains(i)) {
                numbers.add(i);
            } 
        }
        System.out.println(numbers);

        nums = numbers.stream().mapToInt(Number::intValue).toArray();
        
        return numbers.size();
    }
}
