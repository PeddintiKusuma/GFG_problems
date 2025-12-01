import java.util.*;

public class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                add(result, a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                add(result, a[i]);
                i++;
            } else {
                add(result, b[j]);
                j++;
            }
        }

        while (i < a.length) {
            add(result, a[i]);
            i++;
        }

        while (j < b.length) {
            add(result, b[j]);
            j++;
        }

        return result;
    }

    private static void add(ArrayList<Integer> list, int value) {
        if (list.isEmpty() || list.get(list.size() - 1) != value) {
            list.add(value);
        }
    }

    
}
