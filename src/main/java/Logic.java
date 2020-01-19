import java.util.function.Consumer;
import java.util.function.Predicate;

public class Logic {

    public static void main(String[] args) {

        Predicate<String> stringLen = (s) -> s.length() < 10;
        System.out.println(stringLen.test("Apples") + " - Apples is less than 10");


        Consumer<String> ConsumerStr = (s) -> System.out.println(s.toLowerCase());
        ConsumerStr.accept("ABCDEFGHIGKLMNOPQRSTUVWXYZ");
    }

}
