package sort;

public class Factorial {

    public static void main(String[] args) {

        int num = 5;

        System.out.println(caculateFactorialUsingRecursion(num));

        System.out.println("Factorial : "+ caculateFactorialUsingLoop(num));

    }

    private static int caculateFactorialUsingRecursion(int num) {
        if (num == 0)
            return 1;

        return num * caculateFactorialUsingRecursion(num -1);
    }

    private static int caculateFactorialUsingLoop(int num) {

        if (num == 0)
            return 1;

        int fact = 1;

        while (num>=1){
            fact = fact*num;
            num--;
        }
//        for (int i = num; i >= 1; i--) {
//            fact = fact*i;
//        }

        return fact;
    }


}
