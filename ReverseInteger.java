/** 
Question 4
Write a function to reverse an integer using numeric operators and without
using any arrays or other data structures.

The signature of the function is:
int f(int n)
Examples

 --------------------------------|--------------------------------------------------------------
| if the input integer is        | return                                                       |
|--------------------------------|--------------------------------------------------------------|
| 1234                           | 4321                                                         |
|--------------------------------|--------------------------------------------------------------|
| 12005                          | 50021                                                        |
|--------------------------------|--------------------------------------------------------------|
| 1                              | 1                                                            |
|--------------------------------|--------------------------------------------------------------|
| 1000                           | 1                                                            |
|--------------------------------|--------------------------------------------------------------|
| 0                              | 0                                                            |
|--------------------------------|--------------------------------------------------------------|
| -12345                         | -54321                                                       |
 --------------------------------|--------------------------------------------------------------

**/
public class ReverseInteger {
    public static void main(String[] args){
        System.out.println(reverseInteger(54009));
    }

    static int reverseInteger(int number) {
        if (number == 0)
            return 0;
        int sign = 1;
        if (number < 0) {
            sign = -1;
            number = -number;
        }
        int reverseInt = 0;
        while(number != 0){
            reverseInt = (reverseInt * 10) + (number % 10);
            number /= 10;
        }
        return sign * reverseInt;
    }
}