public class ClusterCompression {
    public static void main(String[] args){
        System.out.println(clusterCompression(new int[] {2,2,3,3,3,4,4,3,3,4,4,5,5}));
    }
    public static int[] clusterCompression(int[] a) {
        if (a.length < 2) {
            return a;
        }
        int[] res = new int[]{a[0]};
        for (int i : a) {
            if (res[res.length - 1] != i) {
                int[] temp = new int[res.length + 1];
                for (int k = 0; k < res.length; k++) {
                    temp[k] = res[k];
                }
                temp[temp.length - 1] = i;
                res = temp;
            }
        }
        return res;
    }
}
