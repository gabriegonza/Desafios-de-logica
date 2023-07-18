import java.util.HashSet;
import java.util.Set;

public class Diferença {
    public static int diferença(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int num : arr) {
            if (set.contains(num - k)) {
                count++;
            }
            if (set.contains(num + k)) {
                count++;
            }
            set.add(num);
        }

        return count;
    }
}
