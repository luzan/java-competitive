/**
Question 13
Consider the positive integer 50. Note that 50 = 25 + 25 = 5^2 + 5^2 and 50 = 1 + 49 = 1^2 + 7^2,
Thus 50 can be expressed as a sum of the two squares in two different ways.
Write a method whether or not a positive integer n can be expressed as a sum of two squares in
exactly two different ways.
The signature of the function is
int answerOne(int n)
Next number to test is 125
= 4 + 121 = 2^2 + 11^2
= 25 + 100 = 5^2 + 10^2
 */
public class TwoSquare {
    public static void main(String[] args){
        System.out.println(isTwoSquare(325));
    }

    static String isTwoSquare(int n){
        int length = 2; 
        int count = 0;
        boolean[] twoSquare = new boolean[length];
        int atPosJ = 0;
        for(int i=1; i<n; i++){
            if(i == atPosJ) {
                break;
            }
            for(int j=1; j<n; j++){
                if((Math.pow(i, 2) + Math.pow(j, 2)) == n){
                    if(count > length - 1){
                        return "No it can be expessed as exacatly two Square Number";
                    }
                    twoSquare[count] = true;
                    count++; 
                    atPosJ = j;
                }
            }
        }
        for (boolean b : twoSquare) {
            if(b)
                return "Yes it can be expessed as Two Square Number";
        }
        return "No it cannot be expressed as Two Square Number";
    }

}
