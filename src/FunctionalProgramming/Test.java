package FunctionalProgramming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Function;

public class Test {

    public static void main(String[] args) {

        String sDate1="31/12/1998";

        dateConverterFunc(Test::dateConverter, sDate1);
        dateConverterFunc((String dateStr) -> {
            Date date = null;
            try {
                date = new SimpleDateFormat("MM/dd/yyyy").parse(sDate1);
            } catch (ParseException e) {

            }
            return date;
        }, sDate1);
    }

    private static Date dateConverter(String sDate1)  {
        Date date = null;
        try {
             date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;

    }

    // write code to sort array of string
    // write a code to add two number using lambda expression


    private static Date dateConverterFunc(Function<String, Date> f, String dateStr){
        Date date = f.apply(dateStr);
        System.out.println("The Cnverted Date is : " + date);
        return date;
    }
}
