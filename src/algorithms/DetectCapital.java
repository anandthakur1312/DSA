package algorithms;

import java.util.stream.Stream;

public class DetectCapital {

    public static void main(String[] args) {

        System.out.println(isWordCorrect("Am"));

    }

    private static boolean isWordCorrect(String word) {

        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
            for (int i = 2; i < word.length(); i++) {
                if (Character.isLowerCase(word.charAt(i)) ){
                    return false;
                }
            }
        }
        else {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i)) ){
                    return false;
                }
            }
        }

        return true;
    }


}
