// Если необходимо, исправьте данный код (задание 2

// try {
//     int d = 0;
//     double catchedRes1 = intArray[8] / d;
//     System.out.println("catchedRes1 = " + catchedRes1);
//  } catch (ArithmeticException e) {
//     System.out.println("Catching exception: " + e);
//  }
 

package homework2;

public class task2 {
    public static void main(String[] args) {
        int[] intArray = new int [10];
        int d = 0;
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("cant divide on zero" + e);
         } 
    }
}
