import java.awt.*;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {


//        OTP Integer Generation
//        Supplier<String> s = () -> {
//            String otp = "";
//            for (int i = 1; i <= 6; i++) {
//                otp = otp + (int)(Math.random() * 10);
//            }
//            return otp;
//        };
//
//        System.out.println(s.get());
//        System.out.println(s.get());
//        System.out.println(s.get());
//        System.out.println(s.get());
//        System.out.println(s.get());

        Supplier<String> sp = () -> {
            String otp = "";
            String str= "AbCdOfGhIKlMnOpQ";
            for(int i=1;i<=3;i++){
                otp = otp + (int)(Math.random()*10) + str.charAt((int)(Math.random()*10));
            }
            return otp;
        };
        System.out.println(sp.get());
        System.out.println(sp.get());
        System.out.println(sp.get());
        System.out.println(sp.get());
    }
}

