import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApiSlicing {

    public static void main(String[] args) {

        Arrays.asList("India", "USA", "UK", "Japan", "China", "Russia")
                .stream()
                .skip(2)
                .limit(3)
                .forEach(System.out::println);


        System.out.println("**********");
        Stream<String> countryStream = Stream.of("India", "China", "USA", "UK", "Japan", "China", "Russia");
        countryStream.distinct().forEach(System.out::println);

    }

}
