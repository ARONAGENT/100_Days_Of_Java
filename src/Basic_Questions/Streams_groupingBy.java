package Basic_Questions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
// how to group elements by using streams
/**
 * 💡 Concept: groupingBy()
 * Collectors.groupingBy() is a collector that groups stream elements by a classifier function (e.g., group employees by department, college, age group, etc.).
 * It returns a Map<K, List<T>> where:
 * K is the key (e.g., college name)
 * List<T> is a list of items that belong to that grou
 */

public class Streams_groupingBy {
    record Employee(int id ,
                    String empnm,
                    String college){


    }


    public static void main(String[] args) {
        List<Employee> employees=List.of(
                new Employee(1,"Harry","Sipna"),
                new Employee(2,"Otkar","Meghe"),
                new Employee(4,"HMMMs","Sipna"),
                new Employee(5,"Guchy","Meghe"),
                new Employee(6,"Burrry","Sipna"),
                new Employee(7,"Bushy","Pothe"),
                new Employee(9,"Dani","Pothe"),
                new Employee(10,"Miki","Sipna"),
                new Employee(8,"Barry","HVPM"),
                new Employee(90,"Sunny","Meghe")

                );

        Map<String,List<Employee> >collegeList=employees
                .stream()
                .collect(Collectors.groupingBy(Employee::college));

        collegeList.forEach((college,emp)->{
            System.out.println(college);
            emp.forEach(e-> System.out.println(e.id()+" " +e.empnm()));
            System.out.println("------------------------------------------------");
        });

        // count college students
        Map<String, Long> collegeCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::college, Collectors.counting()));

        System.out.println(collegeCount);
    }
}
