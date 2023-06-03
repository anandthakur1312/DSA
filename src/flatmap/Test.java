package flatmap;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {


        List<Integer> evenNumList = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> oddNumList = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> primeNumList = Arrays.asList(1, 2, 3, 5, 7, 11);

        Stream<Integer> integerStream = evenNumList.stream();

        evenNumList.stream().map(num -> {
            return num + num;
        }).forEach(System.out::println);

        evenNumList.stream().map(num -> num + num).forEach(System.out::println);

        List<List<Integer>> listList = Arrays.asList(evenNumList, oddNumList, primeNumList);

        List<Stream<Integer>> collect = listList.stream()
                .map(list -> list.stream())
                .collect(Collectors.toList());

        List<Integer> collect1 = listList.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList()); 
//
        listList.stream().flatMap(l -> {
            System.out.println("after flat map -> " +l);
            Stream<Integer> stream = l.stream();
            System.out.println("flat map return value -> " +stream);
            return stream;
        }).forEach(e -> System.out.print(e + " , "));
        System.out.println();

        Stream<List<Integer>> stream = listList.stream();

        System.out.println("-----------------------");
//
        listList.stream().map(list -> {
            System.out.println("after map -> " +list);
            Stream<Integer> integerStream1 = list.stream();
            System.out.println(" map return value -> " +integerStream1);
            return integerStream1;
        }).forEach(e -> System.out.print(e + " , "));
        System.out.println();

        System.out.println("-----------------");

        listList.stream().map(list -> {
            System.out.println("after map -> " +list);
            Stream<Integer> integerStream1 = list.stream();
            System.out.println(" map return value -> " +integerStream1);
            return integerStream1;
        }).forEach(e -> e.forEach(System.out::print));


    }

//    <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
//    <R> Stream<R>     map(Function<? super T, ? extends R> mapper);


}

