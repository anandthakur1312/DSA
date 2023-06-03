package algorithms;

public class ReverseAString {

    public static void main(String[] args) {

//        System.out.println(String.valueOf(reverse("Apple")));
//
//        System.out.println(reverseUsingStringBuilder("Apple"));

        System.out.println(reverseUsingRecursion("Apple"));


    }

    private static String reverseUsingRecursion(String str) {

        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseUsingRecursion(str.substring(1)) + str.charAt(0);

    }

    private static String reverseUsingStringBuilder(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() -1; i >= 0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }


    private static char[] reverse(String apple) {

        char[] reversedArray = new char[apple.length()];

        for (int i = 0; i < apple.length(); i++){
            reversedArray[i] = apple.charAt(apple.length() - 1 - i);
        }

//        char[] appleCharArray = apple.toCharArray();
//        char[] reversedArray = new char[appleCharArray.length];
//        for (int i = 0; i < appleCharArray.length; i++){
//            reversedArray[i] = appleCharArray[appleCharArray.length -1 -i];
//        }
        return reversedArray;
    }
}
