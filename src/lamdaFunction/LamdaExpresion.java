package lamdaFunction;

interface Calculator{
    int sum(int a,int b);
}

public class LamdaExpresion {

    public int getLength(String name) {
        return name.length();
    }
    //or
//    name -> name.length() ; this is a Lamda Expresion

    public static void main(String[] args) {

//=========================================================
//   Task : Take 2 inputs and perform sum of two inputs and return ouput
//=========================================================

        Calculator cal = (a , b) -> a + b;
        System.out.println(cal.sum(1,2));


   }
}
