package algorithms;

public class IntToRom {

    public static void main(String[] args) {


        System.out.println(integerToRoman(3001));

    }

    private static String integerToRoman(int num) {

        String[] thousands = {" ", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XL" };
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

        int unit = num % 10;
        int ten = (num % 100)/10;
        int hundred = (num % 1000)/100;
        int thousand = (num / 1000);

        return thousands[thousand] + hundreds[hundred] + tens[ten] + units[unit];

    }


}


