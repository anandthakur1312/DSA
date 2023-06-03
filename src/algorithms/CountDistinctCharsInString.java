package algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctCharsInString {

    public static void main(String[] args) {
        String str = "anand";

        countChars(str).forEach((k, v) -> System.out.println(k + " --" + v));
        countCharsNew(str).forEach((k, v) -> System.out.println(k + " --" + v));
        countCharsUsingStream(str).forEach((k, v) -> System.out.println(k + " --" + v));

    }

    private static Map<Character, Integer> countCharsNew(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()){
                map.putIfAbsent(c, 0);
                map.put(c, map.get(c)+1);
        }
        return map;
    }

    private static Map<Character, Integer> countChars(String str) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else map.put(c, 1);
        }

        return map;
    }


    private static Map<Character, Integer> countCharsUsingStream(String str) {

        Map<Character, Integer> map = new HashMap<>();

         str.chars().forEach(c -> {
            if (map.containsKey((char)c)){
                map.put((char)c, map.get((char)c) + 1);
            }
            else map.put((char)c, 1);
        });

        return map;
    }


}
