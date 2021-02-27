
import java.util.List;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        int[] n = {2,2,1};
        int s = singleNumber(n);
        System.out.println(s);
    }

    public static int singleNumber(int[] nums) {
        List<Integer> no_duplicate_list = new ArrayList<>();

        for (int i : nums) {
            if (!no_duplicate_list.contains(i)) {
                no_duplicate_list.add(i);
            } else {
                no_duplicate_list.remove(Integer.valueOf(i));
            }
        }
        return no_duplicate_list.get(0);
    }
}
