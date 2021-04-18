import java.net.SocketPermission;

public class BalancedArray {
    public static void main(String[] args) {
        System.out.println(isBalanced(new int[] {2,3,6,7}));
    }
    public static int isBalanced(int[] a) {
        for (int i = 0; i < a.length; ) {
            if (a[i++] % 2 != 0) {
                if (i < a.length && a[i++] % 2 != 0) {
                    return 0;
                }
            } else {
                return 0;
            }
        }
        return 1;
    }
}
