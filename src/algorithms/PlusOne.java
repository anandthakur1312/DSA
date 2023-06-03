package algorithms;

public class PlusOne {

    public static void main(String[] args) {

        int[] digitArray = {1,9};

        System.out.println(plusOne(digitArray));

    }

    public static int[] plusOne(int[] digits) {

        for(int l=digits.length-1; l>=0; l--){
            if(digits[l] == 9){
                digits[l] = 0;
            }
            else{
                digits[l] = digits[l]+1;
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    // 999 -> 1000
    // 299 - 300
    // 229 -> 230

}
