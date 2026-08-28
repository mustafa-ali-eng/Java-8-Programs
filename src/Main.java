
interface Vehicle {

    public abstract void startVechicle ( );

    public default void cleanVechicle ( )
    {
        System.out.println("Cleaning Vechicle");
    }

    public static void repairVechicle ( )
    {
        System.out.println("Repairing Vechicle");
    }


}

class Car implements Vehicle {

    @Override //interface default methods we can override in impl classes
    public void cleanVechicle ( )
    {
        System.out.println("Car Cleaning Vechicle");
    }

    public void startVechicle ( ) {
        // logic to start car
    }
}

class Bus implements Vehicle {
    public void startVechicle ( ) {
        // logic to start  bus
    }

//    @Override //static method never get inheritade  interface static methods we can't overide in impl classes
    public static void repairVechicle ( )
    {
        System.out.println("Repairing Vechicle");
    }
}

class Bike implements Vehicle {
    public void startVechicle ( ) {
        // logic to start  bike
    }
}






public class Main {
    public static void main(String[] args) {
        System.out.println("Day 1 of java 8");

        Car c = new Car();
        c.startVechicle ( );  //abstract method call
        c.cleanVechicle ( );   //default method call
        Vehicle.repairVechicle ( ); //static method call
//        Vehicle.cleanVechicle;   error
//        c.repairVechicle();  //error


    }
}