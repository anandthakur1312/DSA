package algorithms;

import java.sql.SQLOutput;

public class ReverseAnInteger {


    public static void main(String[] args) {

        System.out.println(reverseAfterConvertingToString(123));

        System.out.println(reverseInteger(54321));

    }

    private static int reverseInteger(int num) {
        int reversed = 0;
        while(num != 0){
            reversed = reversed * 10 + num % 10;

            num = num/10;
        }
        return reversed;
    }

    public static int reverseAfterConvertingToString(int number){
        String numString = String.valueOf(number);
        char[] revCharArray = new char[numString.length()];
        if (numString.charAt(0) == '-'){
            revCharArray[0] = '-';
            for (int i = 1; i < numString.length(); i++){
                revCharArray[i] = numString.charAt(numString.length()-i);
            }
        }

        else {
            for (int i = 0; i < numString.length(); i++){
                revCharArray[i] = numString.charAt(numString.length() - 1 - i);
            }
        }

       return Integer.parseInt(String.valueOf(revCharArray));
    }






}


