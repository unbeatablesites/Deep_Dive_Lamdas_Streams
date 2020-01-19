import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Logic {

    public static void main(String[] args) {

        Predicate<String> stringLen = (s) -> s.length() < 10;
        System.out.println(stringLen.test("Apples") + " - Apples is less than 10");


        Consumer<String> ConsumerStr = (s) -> System.out.println(s.toLowerCase());
        ConsumerStr.accept("ABCDEFGHIGKLMNOPQRSTUVWXYZ");

        Function<Integer,String> converter = (num) -> Integer.toString(num);
        System.out.println("Char Length of int 200: " + converter.apply(263).length());

        Supplier<String> s = () -> "Java is fun";
        System.out.println(s.get());

        BinaryOperator<Integer> add = (a,b) -> a+b;
        System.out.println("The result of 5 and 5 is " + add.apply(5,5));

        UnaryOperator<String> str = (f) -> f.toUpperCase();
        System.out.println(str.apply("qwertyuioplkjhgfdsazxcvbnm"));


        List<String> names = new ArrayList<>();

        names.add("Frank");
        names.add("Brad");
        names.add("Mike");
        names.add("John");
        names.add("Frank");
        names.add("Brad");
        names.add("Mike");

        System.out.println(names);

        Predicate<List>  addName = (r) ->  r.size() < 10;
        System.out.println(addName.test(names));
        System.out.println(names);
    }

}
