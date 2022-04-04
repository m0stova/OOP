package array;

public class ArrayTask {

    public static void main(String[] args) {

        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};

        String[] word3 = new String[]{"abgf", "c"};
        String[] word4 = new String[]{"afg", "bc"};

        String[] word5 = new String[]{"abc", "d", "defg"};
        String[] word6 = new String[]{"abcddefg"};


        ArrayTask arrayComparison1 = new ArrayTask();
        arrayComparison1.arrayStringsAreEqual(word1, word2);

        ArrayTask arrayComparison2 = new ArrayTask();
        arrayComparison2.arrayStringsAreEqual(word3, word4);

        ArrayTask arrayComparison3 = new ArrayTask();
        arrayComparison3.arrayStringsAreEqual(word5, word6);

    }

    public boolean arrayStringsAreEqual (String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";

        for (String s : word1) str1 += s;

        for (String s : word2) str2 += s;

        System.out.println();
        System.out.println("Are these 2 arrays equals? - " + str1.equals(str2));

        return str1.equals(str2);
    }

}
