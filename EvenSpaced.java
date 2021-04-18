/**
 * Question 23
An integer array is said to be evenSpaced, if the difference between the largest value
and the smallest value is an even number.

Write a function isEvenSpaced(int[] a) that will return 1 if it is evenSpaced and 0 otherwise.
if array has less than two elements, function will return 0.
 --------------------|--------------|----------------|----------------|----------------------------
| Array              | Largest value| Smallest value | Difference     | Return value               |
|--------------------|--------------|----------------|----------------|----------------------------|
| {100,19,131,140}   | 140          | 19             | 140 - 19 = 121 | 0                          |
|--------------------|--------------|----------------|----------------|----------------------------|
| {200,1,151,160}    | 200          | 1              | 200 - 1 = 199  | 0                          |
|--------------------|--------------|----------------|----------------|----------------------------|
| {200,10,151,160}   | 200          | 10             | 200 - 10 = 190 | 1                          |
|--------------------|--------------|----------------|----------------|----------------------------|
| {100,19,-131,-140} | 100          | -140           | 100-(-140)= 240| 1                          |
|--------------------|--------------|----------------|----------------|----------------------------|
| {80,-56,11,-81}    | 80           | -81            | 80 -(-81) = 161| 0                          |
 --------------------|--------------|----------------|----------------|----------------------------
 */
public class EvenSpaced {
    public static void main(String[] args){
        System.out.println(isEvenSpaced(new int[] {80,-56,11,-81}));
    }
    static int isEvenSpaced(int[] a){
        if(a.length < 2)
            return 0;
        int max = 0;
        int min = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] > max)
                max = a[i];
            if(a[i] < min)
                min = a[i];
        }
        int space = 0;
        space = max - min;
        if (space % 2 == 0)
            return 1;
        return 0;
    }
}
