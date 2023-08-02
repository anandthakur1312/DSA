package algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Isomorphic {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("aba", "baa"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, StringBuilder> mapS = new HashMap<>();
        Map<Character, StringBuilder> mapT = new HashMap<>();

        for (int i = 0; i<s.length(); i++){
            if(mapS.get(s.charAt(i)) == null){
                mapS.put(s.charAt(i), new StringBuilder(i));
            }else {
                mapS.put(s.charAt(i), mapS.get(s.charAt(i)).append(i).append(","));
            }

            if(mapT.get(t.charAt(i)) == null){
                mapT.put(t.charAt(i), new StringBuilder(i));
            }else {
                mapT.put(t.charAt(i), mapT.get(t.charAt(i)).append(i).append(","));
            }

            if(!mapS.get(s.charAt(i)).toString().contentEquals(mapT.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }


    public static boolean isIsomorphicOldWorking(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, StringBuilder> mapS = new HashMap<>();
        Map<Character, StringBuilder> mapT = new HashMap<>();

        for (int i = 0; i<s.length(); i++){
            if(mapS.get(s.charAt(i)) == null){
                mapS.put(s.charAt(i), new StringBuilder(i));
            }else {
                mapS.put(s.charAt(i), mapS.get(s.charAt(i)).append(i));
            }

            if(mapT.get(t.charAt(i)) == null){
                mapT.put(t.charAt(i), new StringBuilder(i));
            }else {
                mapT.put(t.charAt(i), mapT.get(t.charAt(i)).append(i));
            }
        }

        for (int i = 0; i<s.length(); i++){
            if(!mapS.get(s.charAt(i)).toString().contentEquals(mapT.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
