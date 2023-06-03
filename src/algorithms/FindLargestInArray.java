package algorithms;

public class FindLargestInArray {

    public static void main(String[] args) {

        double[] numbers = {1,3,4,5,22,6,2,3,7,9,0};

//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] =  Math.random();
//        }

//        for (double n : numbers){
//            System.out.println(n);
//        }

        double max = Double.MIN_VALUE;
        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("The Maximum Number is : " + max);
    }
}
