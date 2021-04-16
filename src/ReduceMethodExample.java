import java.util.List;

public class ReduceMethodExample {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,7,3,5,8,34,33,16,2,20);

        // sum of all number of list
        int n = numbers.stream().reduce((c,e) -> c+e).get();
        System.out.println(n);

        // Sum of all even number of list
        int n1 = numbers.stream().filter( num-> num % 2 == 0).reduce(Integer::sum).get();
        System.out.println(n1);

        // Sum of all odd number of list
        int n2 = numbers.stream().filter( num-> num % 2 == 1).reduce(Integer::sum).get();
        System.out.println(n2);

        // it returns first value which divisible by 5 in list, if no value is present which is divisible by 5 then it returns 0
        int n3 = numbers.stream().filter(i -> i%5==0).findFirst().orElse(0);
        System.out.println(n3);


    }
}
