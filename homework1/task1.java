// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

package homework1;

public class task1 {

    public static void main(String[] args) {     
        System.out.println(division(5,0));

        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(elementByIndex(myArray, 7));

        String[] someArray = {"whatever", "no", "idea"};
        printStringArray(someArray);

    }


    public static double division(double num, double denom){
        if(denom ==  0) {
            throw new ArithmeticException("denominator cant be a zero");
        }
        double result = num/denom;
        return result;
    }
    // out of bounds
    public static int elementByIndex(int[] array, int index){
        if(index > array.length-1) {
            throw new RuntimeException("the element doesnt exist");
        }
        return array[index];
    }

    //null pointer
    public static void printStringArray(String[] strArray){
        for (String item: strArray){
            if(item == null) throw new NullPointerException("No element");
            System.out.println(item);
        }
    }

}
