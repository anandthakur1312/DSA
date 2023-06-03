package algorithms;

import java.util.HashMap;
import java.util.Map;

public class RomToInt {

    public static void main(String[] args) {

        System.out.println(romanToInteger("DCCC"));
    }

    private static int romanToInteger(String romanStr) {

        int result = 0;

        Map<Character, Integer> romToIntMap = new HashMap<>();
        romToIntMap.put('I', 1);
        romToIntMap.put('V', 5);
        romToIntMap.put('X', 10);
        romToIntMap.put('L', 50);
        romToIntMap.put('C', 100);
        romToIntMap.put('D', 500);
        romToIntMap.put('M', 1000);

        for (int i = 0; i < romanStr.length(); i++) {

            if (i > 0 && romanStr.charAt(i) > romanStr.charAt(i-1)){
                result += romToIntMap.get(romanStr.charAt(i)) - 2*romToIntMap.get(romanStr.charAt(i-1));
            } else {
                result += romToIntMap.get(romanStr.charAt(i));
            }
        }
        return result;
    }
}
