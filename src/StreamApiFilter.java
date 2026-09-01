import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



class User{
     String name;
     int age;
     public User(String name, int age){
         this.name=name;
         this.age=age;
     }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class StreamApiFilter {

    public static void main(String[] args) {

        //methode 1
        Stream<Integer> integerStream = Stream.of(1, 4, 6, 3, 7, 8, 9, 5, 0);

        List<String> names = new ArrayList<>();
         names.add("Mustafa");
         names.add("Ali");
         names.add("Killer");
         names.add("Kalan");
         names.add("Alam");
         names.add("Ahmed");

        //methode 2
        Stream<String> stream = names.stream();




//===================
//  Example - 1 : Filter
//  ==================


        List<Integer> integers = List.of(10, 43, 24, 16, 79, 13, 95, 15, 10);

//        for(Integer in : integers){
//            if(in > 20){
//                System.out.println(in);
//            }
//        }

//        Stream<Integer> stream1 = integers.stream();
//        Stream<Integer> integerStream1 = stream1.filter(i -> i > 20);
//        integerStream1.forEach(i -> System.out.println(i));


        integers.stream().filter(i ->  i >  20).forEach(i -> System.out.println(i));

//==========================
//   Example - 2 : Filter
// ========================

        List<String> names1 = Arrays.asList("John", "Anushka", "Anupama", "Smith", "Ashok");

        names1.stream().filter(name -> name.startsWith("A")).forEach(name -> System.out.println(name));



//==========================
//   Example - 2 : Filter
// ========================


        User u1 = new User("Mustafa", 20);
        User u2 = new User("Ali", 30);
        User u3 = new User("Killer", 22);
        User u4 = new User("Alam", 10);
        User u5 = new User("Ashok", 16);
        User u6 = new User("Smith", 42);
        User u7 = new User("Anushka", 18);
        User u8 = new User("Alam", 30);

        List<User> users = Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8);

//        users.stream().filter(user -> user.age >= 18 && user.name.startsWith("A")).forEach(user -> System.out.println(user));
                                       //or
        users.stream().filter(u -> u.age >= 18)
                .filter(u -> u.name.startsWith("A"))
                .forEach(u -> System.out.println(u));







    }

}
