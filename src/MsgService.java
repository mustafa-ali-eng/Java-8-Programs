import java.util.Optional;
import java.util.Scanner;

public class MsgService {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id:");
        int id = sc.nextInt();

        UserInfo ui = new UserInfo();
        String name = ui.getNameById(id);

//        System.out.println(name.toUpperCase()+"Hello");  here you get  NullPointerException

        // Without Optional object
        if(name != null){  //Every programmer not check
             System.out.println(name.toUpperCase()+" Hello");
         }
         else{
             System.out.println("Invalid id");
         }


        // With Optional object
        Optional<String> name1 = ui.getName(id);
         if(name1.isPresent()){
             System.out.println(name1.get().toUpperCase()+" Hello");
         }else {
             System.out.println("No Data Found");
         }


    }

}
