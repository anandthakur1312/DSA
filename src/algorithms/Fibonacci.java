package algorithms;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(findNthFib(2)); //1,1,2,3,5,8
    }
    private static int findNthFib(int n) {
        if (n == 1 || n==2) return 1;
        int first = 1;
        int second = 1;
        int third = 0;
        for (int i = 2; i < n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }


}
