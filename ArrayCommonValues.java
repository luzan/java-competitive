import java.util.Arrays;
/**
 * Question 5
Write a function to return an array containing all elements common to two
given arrays containing distinct positive integers. You should not use any inbuilt
methods. You are allowed to use any number of arrays.

The signature of the function is:
int[] f(int[] first, int[] second)

Examples:
 --------------------------------|--------------------------------------------------------------
| if the input parameters are    | return                                                       |
|--------------------------------|--------------------------------------------------------------|
| {1,8,3,2},{4,2,6,1}            | {1,2}                                                        |
|--------------------------------|--------------------------------------------------------------|
| {1,8,3,2,6},{2,6,1}            | {2,6,1}                                                      |
|--------------------------------|--------------------------------------------------------------|
| {1,3,7,9},{7,1,9,3}            | {1,3,7,9}                                                    |
|--------------------------------|--------------------------------------------------------------|
| {1,2}, {3,4}                   | {}                                                           |
|--------------------------------|--------------------------------------------------------------|
| {}, {1,2,3}                    | {}                                                           |
|--------------------------------|--------------------------------------------------------------|
| {1,2}, {}                      | {}                                                           |
|--------------------------------|--------------------------------------------------------------|
| {1,2}, null                    | null                                                         |
|--------------------------------|--------------------------------------------------------------|
| null, {}                       | null                                                         |
|--------------------------------|--------------------------------------------------------------|
| null, null                     | null                                                         |
 --------------------------------|--------------------------------------------------------------

NOTE: To ease debugging, Will return a string array.
 */
public class ArrayCommonValues {
    public static void main(String[] args){
        System.out.println(Arrays.toString(arrayCommonValues(new int[] { 1, 8, 3, 4 }, new int[] { 1, 5, 7, 4 })));
    }

    static int[] arrayCommonValues(int[] firstArray, int[] secondArray){
        if (firstArray.length == 0 || secondArray.length == 0){
            int[] arrayZero = new int[0];
            return arrayZero;
        }
        if (firstArray == null || secondArray == null){
            return null;
        }
        int minimumLength = (firstArray.length < secondArray.length)? firstArray.length : secondArray.length;
        int[] firstTemp, secondTemp;

        if (minimumLength == firstArray.length){
            firstTemp = firstArray;
            secondTemp = secondArray;
        } else {
            firstTemp = secondArray;
            secondTemp = firstArray;
        }
        int[] commonDump = new int[minimumLength];
        int count = 0;

        for(int i = 0; i < firstTemp.length; i++) {
            for(int j = 0; j < secondTemp.length; j++) {
                if(firstTemp[i] == secondTemp[j]) {
                    commonDump[count] = firstTemp[i];
                    count++;
                }
            }
        }

        int[] finalArray = new int[count];
        for(int i = 0; i < finalArray.length; i++){
            finalArray[i] = commonDump[i];
        }
        
        return finalArray;
    }
}
