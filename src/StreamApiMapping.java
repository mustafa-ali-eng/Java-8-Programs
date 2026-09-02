import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiMapping {

    public static void main(String[] args) {



//=======================
//  Example-1 : map ( ) method
// =======================

        List<String> names = Arrays.asList("india","usa","uk", "japan");

       /* for(String name : names){
            System.out.println(name.toUpperCase());
        } */

        names.stream().map(String::toUpperCase).forEach(System.out::println);

        names.stream().map(String::length).forEach(System.out::println);


 // =======================
//  Example-2 : map ( ) method // print name with its length which are starting with 'A' using Stream API
// =======================


        List<String> names1 = Arrays.asList("Ashok", "Anil", "Raju", "Rani", "John", "Akash", "Charles");

        names1.stream().filter(name -> name.startsWith("A")).map(name -> name + " : " + name.length()).forEach(System.out::println);

                                  //or

        names1.stream().filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println(name + " : " + name.length()));


        System.out.println("**********************");
//=======================
// Example-3 : map ( ) method // Task : Print Emp Name with Emp age whose salary is >= 50,000 using Stream API.
//=======================

        Employee1 e1 =new Employee1("John", 25, 40000);
        Employee1 e2 =new Employee1("Ravi", 30, 30000);
        Employee1 e3 =new Employee1("Anil", 28, 18000);
        Employee1 e4 =new Employee1("Rani", 35, 24000);
        Employee1 e5 =new Employee1("Akash", 32, 65000);

        Stream<Employee1> employee1Stream = Stream.of(e1, e2, e3, e4, e5);

       /* employee1Stream.filter(emp -> emp.salary >= 50000)
                .map(emp -> emp.name + " : " + emp.age)
                .forEach(System.out::println); */


        employee1Stream.filter(emp -> emp.salary >= 50000)
                .forEach(emp -> System.out.println(emp.name + " : " + emp.age));



//   ===================================
//    Q) What is flatMap(Function f) method ?
//    ===================================


        List<String>  javaCourse = Arrays.asList("Core java", "Adv java", "SpringBoot");

        List<String> uiCourse = Arrays.asList("html", "css", "bs", "js");

        List<List<String>> courses = Arrays.asList(javaCourse, uiCourse);

//         courses.stream().forEach(System.out::println);

        courses.stream().flatMap(Collection::stream).forEach(System.out::println);

    }


}

class Employee1 {

    String name;
    int age;
    double salary;


    Employee1(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}