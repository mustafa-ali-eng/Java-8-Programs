import java.util.StringJoiner;

public class StringJoinerDemo {

    public static void main(String[] args) {

        StringJoiner  spj1 = new StringJoiner("-");
        spj1.add("Mustafa");
        spj1.add("Ali");
        spj1.add("Is");
        spj1.add("Engineer");
        System.out.println(spj1);  //Mustafa-Ali-Is-Engineer


        StringJoiner  spj2 = new StringJoiner("-", "(", ")");
        spj2.add("Mustafa");
        spj2.add("Ali");
        spj2.add("Is");
        spj2.add("Engineer");
        System.out.println(spj2);  //(Mustafa-Ali-Is-Engineer)
    }

}
