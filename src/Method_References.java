@FunctionalInterface
interface  Demo {
    public void  m1();
}

class  PrintNumbers{

    public void print(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        PrintNumbers p = new PrintNumbers();
        Runnable r1 = p::print;
        Thread t1 = new Thread(r1);
        t1.start();
    }
}


public class Method_References {

    public static void m2(){
        System.out.println("m2 methode get executed..");
    }

    public static void main(String[] args) {
        Demo d = Method_References::m2;
        d.m1();
    }

}
