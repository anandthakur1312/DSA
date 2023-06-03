package recursion;

import java.util.Arrays;

public class ReturnSubsequences {

    public static String[] findSubsequences(String input){

        if(input.length() == 0){
            String[] ans = {""};
            return ans;
        }

        String[] shortAns = findSubsequences(input.substring(1));
        String[] ans = new String[2*shortAns.length];

        for (int i = 0; i< shortAns.length; i++){
            ans[i] = shortAns[i];
        }

        for(int i = 0; i < shortAns.length; i++){
            ans[i+shortAns.length] = input.charAt(0) + shortAns[i];
        }

        return ans;
    }

    public static void main(String[] args){
        String[] ans = findSubsequences("abc");
//        Arrays.stream(ans).forEach(a -> System.out.println(a[));

        for (int i = 0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
