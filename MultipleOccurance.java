/**
 * Question 14
Write a function that will return the most occurring number in an array. If there is more than
one such number, the function may return any one of them.
If you are programming in Java or C#, the function signature is int answerTwo(int[] a)

Examples
 -------------------------|----------|------------------------------------------------------------
| a                       | return   | Explanation                                                |
|-------------------------|----------|------------------------------------------------------------|
| {6,8,1,8,2}             | 8        | 8 occurs two times. No other number occurs 3 or more times |
|-------------------------|----------|------------------------------------------------------------|
| {6,8,1,8,6,8}           | 8 or 6   | 8, 6. The Function may return either 8 or 6                |
 -------------------------|----------|------------------------------------------------------------
 */

public class MultipleOccurance {
    public static void main(String[] args){
        System.out.println(answerTwo(new int[] {6,8,1,8,6,8,1,1,1}));
    }

    static int answerTwo(int[] a){
        int occuranceCount = 1;
        int lastOccuranceCount = 1;
        int whatWasIt = 0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j< a.length; j++){
                if(a[i] == a[j]){
                    occuranceCount++;
                }
            }
            if(occuranceCount > lastOccuranceCount){
                lastOccuranceCount = occuranceCount;
                whatWasIt = a[i];
                occuranceCount = 1;
            }   
        }
        return whatWasIt;
    }

}
