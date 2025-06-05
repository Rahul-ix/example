import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Employee> d1 = Arrays.asList(
                new Employee(1,"Rahul","IT",70000),
                new Employee(2,"Raj","QA",30000),
                new Employee(3,"Abhira","IT",50000),
                new Employee(4,"Ruhi","Prod",80000),
             new Employee(1,"Rahul","IT",70000),
                new Employee(2,"Raj","QA",30000),
                new Employee(3,"Abhira","IT",50000),
                new Employee(4,"Ruhi","Prod",80000),
                new Employee(5,"Divya","IT",60000) new Employee(1,"Rahul","IT",70000),
                new Employee(2,"Raj","QA",30000),
                new Employee(3,"Abhira","IT",50000),
                new Employee(4,"Ruhi","Prod",80000),
                new Employee(5,"Divya","IT",60000)
                new Employee(5,"Divya","IT",60000)

        );

        List<Employee> it = d1.stream().filter(a -> a.getDepartment().equals("IT")).toList();
        for (Employee d :it){
            System.out.println(d.getDepartment());
        }
        List<Double> l = d1.stream().map(Employee::getSalary).sorted().toList();
        System.out.println(l);

        List<Double> top3 = d1.stream().map(Employee::getSalary).sorted().skip(2).toList();
        System.out.println(top3);

        d1.forEach(e -> System.out.println(e.getName() + " - ₹" + e.getSalary()));

        List<Integer> salary = Arrays.asList(40007,20000,35003,75000);
        Optional<Integer> max = salary.stream().max(Integer::compareTo);
        max.ifPresent(System.out::println);

        System.out.println("-------------------------------");

        Optional<Integer> list = salary.stream().sorted((a, b)->b-a).skip(1).findFirst();
        list.ifPresent(System.out::println);

        System.out.println("-------------------------------");

        int sum = salary.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        System.out.println("-------------------------------");

        List<Integer> list1 = salary.stream().filter(a -> a % 2 == 0).toList();
        System.out.println(list1);

        System.out.println("-------------------------------");

        List<String> data = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<Integer, List<String>> collect = data.stream().distinct().collect(Collectors.groupingBy(a -> a.length()));
        System.out.println(collect);

        System.out.println("-------------------------------");

        List<String> list2 = data.stream().distinct().sorted().toList();
        System.out.println(list2);

        System.out.println("-------------------------------");

        List<Integer> positive = Arrays.asList(1, 2, 3, 4, 5);
        boolean list3 = positive.stream().allMatch(a->a>0);
        System.out.println(list3);

        System.out.println("-------------------------------");

        List<String> list4 = data.stream().map(a -> a.toUpperCase()).toList();
        System.out.println(list4);

        System.out.println("-------------------------------");

        List<Integer> firstEven = Arrays.asList(1, 3, 5, 7, 8, 10);
        Optional<Integer> first = firstEven.stream().filter(a -> a % 2 == 0).findFirst();
        first.ifPresent(System.out::println);

        System.out.println("-------------------------------");




    }
}
