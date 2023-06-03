package algorithms;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Is Number Palindrome : " + isPalindrome(121));
    }

    private static boolean isPalindrome(int number) {

        int original = number;

        int reversed = 0;
        while (number != 0){
            reversed = reversed * 10 + number % 10; // 0 + 1 = 10 + 2 = 120 + 2
            number = number/10; // 122, 12
        }

        return reversed ==  original ;
    }
}
