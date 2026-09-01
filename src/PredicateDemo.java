import java.beans.Expression;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

class Person{

    String name;
    int age;

    public Person (String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}

class Employee
{
    String name;
    String location;
    String department;

    public Employee (String name , String location , String department)
    {
        this.name = name;
        this.location = location;
        this.department = department;
    }
}




public class PredicateDemo {

    public static void main(String[] args) {
//
//        Predicate<Integer> p = i -> i >0;
//
//        System.out.println(p.test(1));
//        System.out.println(p.test(0));


//=======================================================================================
//        Task: Declare names in an array and print names which are starting with 'A' using lambda expression.
//                String[ ]  names = {"Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };
//=========================================================================================


//        String[ ]  names = {"Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };
//        Predicate<String> p1= name -> name.startsWith("A");
//        for (String  name : names)
//        {
//            if(p1.test (name))
//            {
//                System.out.println (name);
//            }
//        }



//============================================================================
//        Task-2 : Take list of persons and print persons whose age is >= 18 using Lambda Expression
//============================================================================

//                List<Person> peoples = new ArrayList<>();
//
//        Person p1 = new Person("John", 25);
//        Person p2 = new Person("Alam", 15);
//        Person p3 = new Person("Killer", 5);
//        Person p4 = new Person("Johan", 12);
//        Person p5 = new Person("Akram", 19);
//
//        peoples.addAll(Arrays.asList(p1,p2,p3,p4,p5));
//
//        Predicate<Person> per= p -> p.age >= 18;
//        for (Person p : peoples) {
//            if (per.test(p)) {
//                System.out.println(p.name +"  -------> "+ p.age);
//            }
//        }



//============================================================================
//        Task-3 : Print emp names who are working in Hyd location in DB team.
//============================================================================


//        List<Employee> employees = new ArrayList<>();
//
//        Employee e1 = new Employee("Anil", "Chennai", "DevOps");
//        Employee e2 = new Employee("Rani", "Pune", "Networking");
//        Employee e3 = new Employee("Ashok", "Hyd", "DB");
//        Employee e4 = new Employee("Ganesh", "Hyd", "DB");
//        Employee e5 = new Employee("Kal", "Bihar", "DB");
//
//        employees.addAll(Arrays.asList(e1,e2,e3,e4,e5));
//        Predicate<Employee> per1 = p -> p.location.equals("Hyd");
//        Predicate<Employee> per2 = p -> p.department.equals("DB");
//
        // Predicate Joining
//        Predicate<Employee> res= per1.and(per2);
//        for (Employee e : employees) {
//            if (res.test(e)) {
//                System.out.println(e.name+" ----> "+e.location+" -----> "+e.department );
//            }
//        }


        //   BiPredicate

        BiPredicate<Integer ,Integer> bip = (i , j) -> (i + j) >=10;
        System.out.println(bip.test(1,2));
        System.out.println(bip.test(9,5));




//                     ERROR there is not tripredicate or so on
//        BiPredicate<Integer ,Integer,Integer> tip = (i , j, k) -> (i + j + k) >=10;
//        System.out.println(bip.test(1,2,6));
//        System.out.println(bip.test(9,5,8));

    }

}
