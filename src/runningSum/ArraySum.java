package runningSum;

import java.util.Arrays;

public class ArraySum {
    public static final String resultString = "The result of runningSum is: ";
    public static void main(String[] args) {

        int[] originalOfArray1 = {1, 2, 3, 4};
        int[] originalOfArray2 = {1,1,1,1,1};
        int[] originalOfArray3 = {3,1,2,10,1};

        int[] resultOfArray1 = runningSum(originalOfArray1);
        System.out.println(resultString + Arrays.toString(resultOfArray1));
        int[] resultOfArray2 = runningSum(originalOfArray2);
        System.out.println(resultString + Arrays.toString(resultOfArray2));
        int[] resultOfArray3 = runningSum(originalOfArray3);
        System.out.println(resultString + Arrays.toString(resultOfArray3));
    }

    public static int[] runningSum(int[] elementsOfArray) {
        int[] result = new int[elementsOfArray.length];
        if (elementsOfArray.length == 0){
            return result;
        }
        result[0] = elementsOfArray[0];
        for (int i = 1; i < elementsOfArray.length; i++) {
            result[i] = result[i - 1] + elementsOfArray[i];
        }
        return result;
    }

}
