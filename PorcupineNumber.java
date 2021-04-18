public class PorcupineNumber {
    public static void main(String[] args){
        System.out.println(findPorcupineNumber(20000));
    }

    static int isPrime(int n){
        if(n<1)
            return 0;
        
        if(n == 1)
            return 1;
        int count = 0;
        for(int i=1; i<= n/2; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 1)
            return 1;
        return 0;
    }

    static int findPorcupineNumber(int n){
        boolean found = false;
        int prevPrime = 0;
        int nowPrime = 0;
        while(!found){
            n++;
            if(isPrime(n) == 1){
                prevPrime = nowPrime;
                nowPrime = n;
            }

            if(prevPrime % 10 == 9 && nowPrime % 10 == 9)
                found = true;
        }
        return prevPrime;
    }
}
