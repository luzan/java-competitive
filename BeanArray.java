/**
 * Question 12
A Bean array is defined to be an integer array where for every value n in the array,
there is also an element 2n, 2n+1 or n/2 in the array.

for example {4,9,8} is a Bean array because for 4,8 is present, for 9, 4 is present, for 8, 4 is present.
Other Bean arrays include {2,2,5,11,23}, {7,7,3,6} and {0}
The array {3,8,4} is not a Bean array because of the value 3 which requires that the array contains
either the value 6, 7 or 1 and none of these values are in the array.
Write a function named isBean that returns 1 if it's array argument is a Bean array,
otherwise it returns a 0.
if you are programming in Java or C#, the function signature is int isBean(int[] a)

 */
public class BeanArray {
    public static void main(String args[]){
        System.out.println(isBean(new int[] {7,7,3,6}));
    }
 
    static int isBean(int[] a) {
        boolean isAllBean[] = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == 2*a[j] || a[i] == 2*a[j] + 1 || a[i] == a[j]/2) {
                    isAllBean[i]= true;
                    break;
                }
            }
        }
        for (boolean b : isAllBean) {
            if(!b)
                return 0;
        }
        return 1;
    }
}
