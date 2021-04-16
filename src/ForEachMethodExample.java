import java.util.Arrays;
import java.util.List;

public class ForEachMethodExample {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1,2,4,7,8,11,14);

        // Iterate to each element & then print it.
        numbers.stream().forEach(num -> System.out.print(num + " "));

        System.out.println();

        // Passing method reference
        numbers.stream().forEach(System.out::println);

    }
}
