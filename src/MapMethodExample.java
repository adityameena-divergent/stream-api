import java.util.List;
import java.util.stream.Collectors;


public class MapMethodExample {
    public static void main(String[] args) {

        List<String> names = List.of("Amit", "Akash", "Abhishek", "Mayank","Sachin", "Aditya");
        List<Integer> numbers = List.of(1,7,3,5,8,34,33,16,2,20);

        // replace char a with z in each string
        List<String> list1 = names.stream().map((name) -> {
            return name.replaceAll("a","z");
        }).collect(Collectors.toList());
        System.out.println(list1);


        // Returns list of square of each number
        List list2 = numbers.stream().map(n-> n*n ).collect(Collectors.toList());
        System.out.println(list2);


        // Returns list of cube of all even number
        List list3 = numbers.stream().filter(n->n % 2 == 0).map(n->n*n*n).collect(Collectors.toList());
        System.out.println(list3);

    }
}
