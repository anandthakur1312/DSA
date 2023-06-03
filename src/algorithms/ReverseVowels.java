package algorithms;

public class ReverseVowels {

    public static void main(String[] args) {

        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {

        StringBuilder vowels = new StringBuilder();

        for(char c : s.toCharArray()){
            if(isVowel(c)){
               vowels.append(c);
            }
        }

        if (vowels.length() == 0){
            return s;
        }

        int j = vowels.length()-1;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(charArray[i])){
                charArray[i] = vowels.charAt(j--);
            }
            if(j < 0)
                return String.valueOf(charArray);

        }
        return s;
    }

    private static boolean isVowel(char c)
    {
        return (c=='a' || c=='A' || c=='e' ||
                c=='E' || c=='i' || c=='I' ||
                c=='o' || c=='O' || c=='u' ||
                c=='U');
    }
}
