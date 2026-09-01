import java.util.Optional;

public class UserInfo {

    // Without Optional object
    public String getNameById(Integer id){
        if(id==100){
            return "Mustafa";
        }else if(id==101){
            return "Ali";
        }
        else if(id==102){
            return "Rehan";
        }else {
            return null;
        }
    }

    // With Optional object
    public Optional<String> getName(Integer id) {

        String name = null;

        if (id == 100) {
            name = "Mustafa";
        } else if (id == 101) {
            name = "Ali";
        } else if (id == 102) {
            name = "Rehan";
        }

        return Optional.ofNullable(name);

    }
}
