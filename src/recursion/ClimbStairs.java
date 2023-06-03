package recursion;

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(stairs(4));
    }
    
    private static int stairs(int n){
        if(n == 1 || n == 0) return 1;
        else return stairs(n-1) + stairs(n-2);
    } 
    
}