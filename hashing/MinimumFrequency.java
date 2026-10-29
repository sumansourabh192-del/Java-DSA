
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int minFreq = Integer.MAX_VALUE;

        for (int freq : map.values()) {
            minFreq = Math.min(minFreq, freq);
        }

        System.out.println("Minimum frequency: " + minFreq);
    }
}
