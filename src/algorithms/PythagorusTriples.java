package algorithms;

import java.util.stream.IntStream;

public class PythagorusTriples {

    public static void main(String[] args) {
        java7way();

//        java8BooksWay();

//        java8MyWay();


    }

    private static void java8MyWay() {
        IntStream.rangeClosed(1, 100).forEach(a -> IntStream.rangeClosed(a, 100)
                        .filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
                        .mapToObj(b -> new int[]{a,b, (int) Math.sqrt(a*a + b*b) })
                .forEach( o -> System.out.println("(" + o[0] + "," + o[1]+ "," + o[2] + ")")));
    }

    private static void java8BooksWay() {
        IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .mapToObj(b -> new double[]{a,b, (int) Math.sqrt(a*a + b*b) }))
                .filter(b -> b[2] % 1 == 0)
                        .forEach( o -> System.out.println("(" + o[0] + "," + o[1]+ "," + o[2] + ")"));
    }

    private static void java7way() {
        for (int i = 1; i<=100; i++){
            for (int j = i; j<= 100; j++){
                if (Math.sqrt(i*i + j*j) % 1 == 0){
                    System.out.println("("+ i +","+j+","+ (int)Math.sqrt(i*i + j*j)+")");
                }
            }
        }
    }
}
