package algorithms;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        int nextNum = 0;
        Set<Integer> previousValues = new HashSet<>();
        previousValues.add(n);
        while (previousValues.add(nextNum)) {
            nextNum = getNextNum(n);
            if (nextNum == 1)
                return true;
            n = nextNum;

        }
        return false;
    }

    private static int getNextNum(int n) {
        int nextNum = 0;
        while(n != 0){
            int lastDigit = n%10;
            nextNum = nextNum + (lastDigit * lastDigit);
            n = n/10;
        }
        return nextNum;
    }
}
