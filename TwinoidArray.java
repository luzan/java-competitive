public class TwinoidArray {
    public static void main(String[] args) {
        System.out.println(isTwinoidArray(new int[] {3,3,2,6,7}));
    }

    static int isTwinoidArray(int[] a){
        int gap = 0;
        boolean gapSet = false;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(i != j){
                    if(a[i] % 2 == 0 && a[j] % 2 ==0){
                        if(!gapSet){
                            gap = i;
                            gapSet = true;
                        } else {
                            gap -= i;
                        }
                    }
                }
            }
        }
        if(gap == -1){
            return 1;
        }
        return 0;
    }
}
