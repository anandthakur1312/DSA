package algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {
        System.out.println(isValid("{{{{()[]()}}}}"));
    }

    public static boolean isValid(String s) {

        Map<Character, Character> matcher = new HashMap<>();

        matcher.put('{', '}');
        matcher.put('(', ')');
        matcher.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(matcher.containsKey(c)){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char open = stack.pop();
                if(matcher.get(open) != c){
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

    //{{(})} {{{{()[\]()}}}}
}

