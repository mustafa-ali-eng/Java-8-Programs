import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

class Student {

    Integer id;
    String name;
    double record;

    Student(Integer id, String name, double record) {
        this.id = id;
        this.name = name;
        this.record = record;
    }
}



public class FunctionDemo {

    public static void main(String[] args) {

//        Function<String , Integer> fun= name -> name.length();
//
//        System.out.println("Hello ---->"+fun.apply("Hello"));
//        System.out.println("World ---->"+fun.apply("World"));
//        System.out.println("Killer ---->"+fun.apply("Killer"));




//=========================================================
// Retrieve student record based on student id and return that record
// =========================================================


        List<Student> students = new ArrayList<>();

        Student s1 = new Student(1 ,"Alam",78.6d);
        Student s2 = new Student(2 ,"Bob",68.6d);
        Student s3 = new Student(3 ,"David",87.0d);
        Student s4 = new Student(4 ,"Robin",84.6d);
        Student s5 = new Student(5 ,"Jack",98.6d);
        Student s6 = new Student(6 ,"Mary",45.6d);

        students.addAll(Arrays.asList(s1,s2,s3,s4,s5,s6));

        Function<Student , Double> rec = id -> id.record;

        System.out.println(rec.apply(s1));

 //  =========================================================
//   Task : Take 2 inputs and perform sum of two inputs and return ouput
//=========================================================
        BiFunction<Integer,Integer ,Integer> bip = (i,j) -> i+j;
        System.out.println(bip.apply(1,2));





    }

}
