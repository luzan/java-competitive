public class BalancedArray3 {
    public static void main(String[] args) {
        System.out.println(isBalanced(new int[] {2,-3,-2,3}));
    }

    static int isBalanced(int[] a){
        for(int i=0; i<= a.length - 1; i++){
            boolean found = false;
            for(int j=0; j<= a.length - 1; j++){
                if(i != j){
                    if(a[i] + a[j] == 0){
                        found = true;
                    }
                }
            }
            if(!found)
                return 0;
        }
        return 1;
    }
}
