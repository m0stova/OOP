package decompressedList;

import java.util.Arrays;

public class DecompressedList {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] result;
        result = decompressingOfArray(original);
        System.out.println("The result of decompressing of array №1 is: " + Arrays.toString(result));

        int[] original2 = {1, 1, 2, 3};
        int[] result2;
        result2 = decompressingOfArray(original2);
        System.out.println("The result of decompressing of array №2 is: " + Arrays.toString(result2));
    }

    public static int[] decompressingOfArray(int[] elementsOfArray) {
        int size = 0, counter = 0;
        for (int i = 0; i < elementsOfArray.length; i += 2)
            size += elementsOfArray[i];
        int[] decompressedList = new int[size];
        for (int i = 0; i < elementsOfArray.length; i += 2) {
            for (int j = 0; j < elementsOfArray[i]; j++)
                decompressedList[counter++] = elementsOfArray[i + 1];
        }
        return decompressedList;
    }


}
