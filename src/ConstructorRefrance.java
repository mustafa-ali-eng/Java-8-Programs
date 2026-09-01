import java.util.function.Supplier;

class MyClass {
    MyClass() {
        System.out.println("Constructor called");
    }
}

public class ConstructorRefrance {
    public static void main(String[] args) {
//        MyClass myClass = new MyClass();

        Supplier<MyClass> supplier = MyClass::new; // Constructor reference
        System.out.println(supplier.get().hashCode());
        System.out.println(System.identityHashCode(supplier.get())); // Calls the constructor
    }
}
