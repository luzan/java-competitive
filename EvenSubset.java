public class EvenSubset {
    public static void main(String[] args) {
        System.out.println(isEvenSubset(18, 32));;
    }
    
    static int isEvenSubset(int m, int n){
        boolean isValid = false;
        for(int i=2; i <= m/2; i = i+2){
            if(m % i == 0){
                if(n%i == 0){
                    isValid = true;
                }else {
                    isValid = false;
                    break;
                }

            }
        }
        if(isValid)
            return 1;
        return 0;
    }
}
