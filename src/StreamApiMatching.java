import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiMatching {

    public static void main(String[] args) {

        List<String>  countrylist = Arrays.asList("India", "USA", "UK", "Japan", "China", "Russia");

        boolean india = countrylist.stream().anyMatch(country -> country.equals("India"));
        System.out.println("Is India present in the list? : " + india);

        boolean allIndia = countrylist.stream().allMatch(country -> country.equals("India"));
        System.out.println("Is every one India present in the list? : " + allIndia);

        boolean indonesia = countrylist.stream().noneMatch(country -> country.equals("Indonesia"));
        System.out.println("Is Indonesia not present in the list? : " + indonesia);
    }

}
