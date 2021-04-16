import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMethodExample {
    public static void main(String[] args) {

        List<String> names = List.of("Amit", "Akash", "Abhishek", "Mayank","Sachin", "Aditya");

        List<Integer> numbers = List.of(1,7,3,5,8,34,89,56,2,20);

        System.out.println(names);

        // Returns list of strings whose length is 6
        List<String> list = names.stream().filter(name -> name.length() == 6).collect(Collectors.toList());
        System.out.println(list);

        // Returns list of strings which starts with A
        List<String> list1 = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(list1);

        System.out.println(numbers);

        // Returns even number of list
        List<Integer> list2 = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println(list2);

        // Returns odd number of list
        List<Integer> list3 = numbers.stream().filter(n -> n%2 == 1).collect(Collectors.toList());
        System.out.println(list3);

    }
}
