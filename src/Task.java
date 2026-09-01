////===========================================================================
////Task-1 : WAJP to print numbers from 1 to 5 using Thread with the help of Runnable interface
////============================================================================
//
////Approach-1
//public class Task implements Runnable {
//
//    @Override
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Task t1 = new Task();
//        Thread thread = new Thread(t1);
////        thread.start();
//    }
//}
//
//
//
////Approach-2
// class Task2  {
//
//    public static void main(String[] args) {
//
//     Runnable runnable = new Runnable() {
//        @Override
//        public void run() {
//            for (int i = 1; i <= 5; i++) {
//                System.out.println(i);
//            }
//        }
//     };
//
//     Thread thread = new Thread(runnable);
//     thread.start();
//    }
//}
//
//
//
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

////Approach-3
//class Task3  {
//
//    public static void main(String[] args) {
//
//        Runnable runnable = () -> {
//            for (int i = 1; i <= 5; i++) {
//                System.out.println(i);
//            }
//        };
//        Thread thread = new Thread(runnable);
//        thread.start();
//    }
//}
//


//==================================================================
//Task: WAJP to store numbers in ArrayList and sort numbers in desending order
//==================================================================

////Approach-1
//public class Task {
//
//    public static void main(String[] args) {
//
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(10);
//        numbers.add(5);
//        numbers.add(20);
//        numbers.add(15);
//
//        System.out.println("Before Sorting: " + numbers);
//
//         Collections.sort(numbers, new MyComparator());
//
//        System.out.println("After Sorting in Descending Order: " + numbers);
//    }
//}
//
//class MyComparator implements Comparator<Integer> {
//    @Override
//    public int compare(Integer o1, Integer o2) {
//
////        if (o1 > o2) {
////            return -1;
////        }
////        else if (o1 <o2) {
////            return 1;
////        }
////        else {
////            return 0;
////        }
//
//        return  -o1.compareTo(o2);
//    }
//}
//

//Approach-2
public class Task {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        System.out.println("Before Sorting: " + numbers);
//
//        Collections.sort(numbers, (o1, o2) -> -o1.compareTo(o2));
                  //or
        Collections.sort(numbers, (i ,j) -> (i > j ? -1 : 1));

        System.out.println("After Sorting in Descending Order: " + numbers);
    }
}
