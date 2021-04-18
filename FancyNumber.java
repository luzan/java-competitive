/**
 * Question 10
A fancy number is a number in the sequence 1,1,5,17,61,... Note the first two fancy numbers
are 1 and any fancy number other than the first two is sum of three times previous one and two times
the one before that. see below
1,
1,
3*1 + 2*1 = 5,
5*3 + 2*1 = 17,
17*3 + 5*2 = 61
Write a function named isFancy that returns 1, if it's integer argument is a Fancy number,
otherwise it returns 0.

 */
public class FancyNumber {
    public static void main(String args[]){
        System.out.println(isFancy(17));
    }
    static int isFancy(int n){
        int pfn = 1, fn = 1;
        int nfn = 0;
        for (int i = 0; i <= n;i++){
            nfn = (3 * pfn) + (2 * fn);
            fn = pfn;
            pfn = nfn;
            if(n == nfn) {
                return 1;
            }
        }
        return 0;
    }
}
