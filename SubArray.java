/**
 * Question 24
 * elements after that. see example below:
 * A Sub Array is defined to be an array in which each element is greater than sum of all
 * {11,5,3,2} is NOT a sub array. Note that 5 is not greater than 3+2.
 * {13,6,3,2} is a sub array. Note that 13 > 6+3+2, 6 > 3+2, 3>2.
 * if you are programming in Java or C#, the function signature is: int isSub(int[] a)
 * Write a function named isSub that returns 1 if its array argument is a Sub array. otherwise it returns 0.
 */
public class SubArray {
    public static void main(String[] args){
        System.out.println(isSub(new int[] {11,5,3,2}));
    }

    static int isSub(int[] a){
        boolean isValid = false;
        for(int i = 0; i < a.length; i++){
            int sum = 0;
            for(int j = i+1; j < a.length; j++){
                sum += a[j];
            }
            if(a[i] > sum){
                isValid = true;
            } else {
                isValid = false;
                break;
            }
        }
        if(isValid)
            return 1;
        return 0;
    }
}
