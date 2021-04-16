import java.util.List;
import java.util.stream.Collectors;

public class SortedMethodExample {
    public static void main(String[] args) {

        List<String> names = List.of("Amit", "Akash", "Abhishek", "Mayank","Sachin", "Aditya");
        List<Integer> numbers = List.of(1,7,3,5,8,34,33,16,2,20);

        // sorting list according to natural sort order
        List<String> list1 = names.stream().sorted().collect(Collectors.toList());
        System.out.println(list1);


        // sorting according to length, if length is equals then sorting according to name
        List<String> list2 = names.stream().sorted((s1,s2)->{
            if(s1.length() != s2.length()) {
                return s1.length() - s2.length();
            } else {
                return s1.compareTo(s2);
            }
        }).collect(Collectors.toList());
        System.out.println(list2);


        // sorting number in descending order
        List<Integer> list3 = numbers.stream().sorted((n1, n2) -> n2-n1).collect(Collectors.toList());
        System.out.println(list3);
    }
}
