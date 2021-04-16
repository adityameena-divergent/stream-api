import java.util.Arrays;
import java.util.List;

/**
 * filter & map are lazy method so if they find first value which is divisible by 5 then these method will not execute for next number
 */
public class LazyMethodVsTerminalFunction {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,9,15,18,20,23);


        int num = numbers.stream().filter(n->isDivisible(n)).map(n->makeDouble(n)).findFirst().orElse(0);

        System.out.println(num);
    }
    public static int makeDouble(int n) {
        System.out.println("Map Method " + n);
        return n * 2;
    }
    public static boolean isDivisible(int n) {
        System.out.println("isDivisible - " + n);
        return n % 5 == 0;
    }
}
