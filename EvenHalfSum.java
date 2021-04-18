/**
 * Question 15
Write a function that will return 1 if an integer array satisfies the following conditions and returns 0 otherwise.
1. it has even numbers of elements == length % 2 === 0
2. Sum of all the numbers in the first half of the array is equal to the sum of all the numbers in the second half of the array. 

If you are programming in Java, the function Signature is
int answerThree(int[] a)
Examples
 -------------------|--------|-----------------------------------------------------------------------
| a                 | return | Explanation                                                           |
|-------------------|--------|-----------------------------------------------------------------------|
| {5,4,3,2,3,4,6,1} | 1      | *There are 8 (even) number of elements in the array. Thus condition 1 |
|                   |        | satisfied.                                                            |
|                   |        | *The sum of all the numbers in the first half = 5+4+3+2 = 14          |
 -------------------|--------|-----------------------------------------------------------------------

 */
public class EvenHalfSum {
    public static void main(String[] args){
        System.out.println(answerThree(new int[]{5,4,3,2,3,4,7,1}));
    }

    static int answerThree(int[] n){
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        if(n.length % 2 == 0){
            for(int i=0; i<n.length; i++){
                if(i < n.length / 2){
                    firstHalfSum += n[i];
                } else {
                    secondHalfSum += n[i];
                }
            }
            if(firstHalfSum == secondHalfSum){
                return 1;
            }
        }
        return 0;
    }
}
