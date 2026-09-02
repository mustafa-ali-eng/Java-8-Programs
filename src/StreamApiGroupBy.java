import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiGroupBy {

    public static void main(String[] args) {

//-> In below example employees will be grouped based on Country name.

        Employee2 e1 = new Employee2("John", "USA", 40000);
        Employee2 e2 = new Employee2("Ravi", "UK", 30000);
        Employee2 e3 = new Employee2("Anil", "INDIA", 18000);
        Employee2 e4 = new Employee2("Rani", "USA", 24000);
        Employee2 e5 = new Employee2("Akash", "INDIA", 65000);


        List<Employee2> eList = Arrays.asList(e1, e2, e3, e4, e5);

        Map<String, List<Employee2>> collectMap = eList.stream().collect(Collectors.groupingBy(e -> e.country));

        collectMap.forEach((k, v) -> {
            System.out.println("Country: " + k);
            v.forEach(System.out::println);
        });


    }

}

class Employee2 {
    String name;
    String country;
    int salary;

    public Employee2(String name, String country, int salary) {
        this.name = name;
        this.country = country;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                '}';
    }
}