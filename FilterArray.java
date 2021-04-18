import java.util.ArrayList;
import java.util.List;

public class FilterArray {
    public static void main(String args[]){
        System.out.println(filterArray(new int[] {8, 4, 9, 0, 3, 1, 2}, 88));
    }
    public static int[] filterArray(int[] a, int n) {
        if (n == 0) {
            return new int[0];
        }
        String binaryStr = Integer.toBinaryString(n);
        List<Integer> list = new ArrayList<>();
        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            if (Integer.valueOf(String.valueOf(binaryStr.charAt(i))) == 1) {
                if (a.length - 1 < (binaryStr.length() - 1 - i)) {
                    return null;
                }
                list.add(a[binaryStr.length() - 1 - i]);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
