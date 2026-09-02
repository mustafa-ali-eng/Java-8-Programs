import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiCollectors {

    public static void main(String[] args) {

        Person1 p1 = new Person1("John", "USA");
        Person1 p2 = new Person1("Steve", "JAPAN");
        Person1 p3 = new Person1("Ashok", "INDIA");
        Person1 p4 = new Person1("Ching", "CHINA");
        Person1 p5 = new Person1("Kumar", "INDIA");

        List<Person1> persons = Arrays.asList(p1, p2, p3, p4, p5);

        List<Person1> indianPersons = persons.stream().filter(person -> person.country.equals("INDIA")).collect(Collectors.toList());
        indianPersons.forEach(System.out::println);

        // collect names of persons who are belongs to india and store into names collection
        List<String> names = indianPersons.stream().map(person -> person.name).collect(Collectors.toList());
        names.forEach(System.out::println);



// => Write a java program to get MAX, MIN and AVG salary from given employees data using Stream API.
        Employee1 e1= new Employee1("John", 25, 40000);
        Employee1 e2= new Employee1("Ravi", 30, 30000);
        Employee1 e3= new Employee1("Anil", 28, 18000);
        Employee1 e4= new Employee1("Rani", 35, 24000);
        Employee1 e5= new Employee1("Akash", 32, 65000);

        List<Employee1> employees = Arrays.asList(e1, e2, e3, e4, e5);

        Optional<Employee1> maxEmployee = employees.stream().collect(Collectors.maxBy(Comparator.comparing(employee1 -> employee1.salary)));
        if(maxEmployee.isPresent()){
            System.out.println(maxEmployee.get());
        }

        employees.stream().collect(Collectors.minBy(Comparator.comparing(employee1 -> employee1.salary)))
                .ifPresent(System.out::println);

        Double collect = employees.stream().collect(Collectors.averagingDouble(employee1 -> employee1.salary));
        System.out.println("Average Salary: " + collect);

    }

}

class Person1 {


    String name;
    String country;
    public Person1(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String toString() {
        return "Name: " + name + ", Country: " + country;
    }
}


