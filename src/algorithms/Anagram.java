package algorithms;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {

        System.out.println("IS Anagram : " + (checkAnagramUsingArray("carrot", "torrac")));
        System.out.println("IS Anagram : " + (checkAnagramUsingMap("carrot", "torrac")));
        System.out.println("IS Anagram : " + (checkAnagramUsingMap("carroty", "torracz")));

    }


    private static boolean checkAnagramUsingArray(String stringOne , String stringTwo){
        char[] first = stringOne.toLowerCase().toCharArray();
        char[] second = stringTwo.toLowerCase().toCharArray();
        // if length of strings is not same
        if (first.length != second.length)
            return false;
        int[] counts = new int[26];
        for (int i = 0; i < first.length; i++){
            counts[first[i]-97]++;
            counts[second[i]-97]--;
        }
        for (int i = 0; i<26; i++)
            if (counts[i] != 0)
                return false;
        return true;
    }

    private static boolean checkAnagramUsingMap(String stringOne, String stringTwo){

        if (stringOne.length() != stringTwo.length()){
            return false;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();
        for(int i = 0; i < stringOne.length(); i++){
            charCountMap.putIfAbsent(stringOne.charAt(i), 0);
            charCountMap.putIfAbsent(stringTwo.charAt(i), 0);
            charCountMap.put(stringOne.charAt(i), charCountMap.get(stringOne.charAt(i)) + 1);
            charCountMap.put(stringTwo.charAt(i), charCountMap.get(stringTwo.charAt(i)) - 1);
        }
        return charCountMap.values().stream().noneMatch(v -> v != 0);
    }

}
