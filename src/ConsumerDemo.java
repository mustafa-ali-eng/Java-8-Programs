import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

//        Consumer<String> con = (name) -> { System.out.println(name +" Good Morning..."); } ;
//
//        con.accept("Mustafa ali");
//        con.accept("Alam");
//        con.accept("Killer");
//        con.accept("Tasteful");
//
//
//        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        // for loop
        // for each loop
        // iterator
        // list iterator


//        numbers.forEach(i-> System.out.println(i));
//                 //Or
//        numbers.forEach(System.out::println);


        BiConsumer<Integer , Integer> biCon = (i,j)->{
            System.out.println("i + j = "+(i+j));
        };

        biCon.accept(1,2);


    }

}
