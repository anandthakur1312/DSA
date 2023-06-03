package optional;

import java.util.Optional;
import java.util.function.Function;

public class OptionalMapFlapMapExample {

    public static void main(String[] args) {

        Optional<String> nonEmptyGender = Optional.of("male");
        Optional<String> emptyGender = Optional.empty();

        Optional<String> myOpt = Optional.of("KulluManali");

        Function<String, Optional<String>> uppCaseFunc =  s -> Optional.ofNullable(s.toUpperCase());

        System.out.println(" aaaaa "+ uppCaseFunc.apply("apple"));

        System.out.println("------"+ nonEmptyGender.map(uppCaseFunc));

        System.out.println("Non-Empty Optional:: " + nonEmptyGender.map(String::toUpperCase));
        System.out.println("Empty Optional    :: " + emptyGender.map(String::toUpperCase));

        Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));
        System.out.println("Optional value   :: " + nonEmptyOtionalGender);
        System.out.println("Optional.map     :: " + nonEmptyOtionalGender.map(gender -> gender.map(String::toUpperCase)));
        System.out.println("Optional.flatMap :: " + nonEmptyOtionalGender.flatMap(gender -> gender.map(String::toUpperCase)));

    }

}