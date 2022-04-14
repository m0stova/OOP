package nesting_depth;

public class NestingDepth {

    public static void main(String[] args) {
        String originalS  = "(1+(2*3)+((8)/4))+1";
        String originalS2 = "(1)+((2))+(((3)))";
        String answer = "Nesting depth of S is: ";
        int result = maxDepth(originalS);
        int result2 = maxDepth(originalS2);
        System.out.println(answer + result);
        System.out.println(answer + result2);
    }

    public static int maxDepth(String s) {
        int nestingDepthOfS = 0;
        int counter = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') nestingDepthOfS = Math.max(nestingDepthOfS, ++counter);
            else if (c == ')') --counter;
        }
        return nestingDepthOfS;
    }
}
