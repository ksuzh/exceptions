// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен частному 
// элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя. 
// Важно: При выполнении метода единственное исключение, 
// которое пользователь может увидеть - RuntimeException, т.е. ваше

package homework1;

public class task4 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 7, 1, 9, 10};

        resArray(array1, array2);
    }

    public static int[] resArray(int[] array1, int[]  array2){
        if (array1.length != array2.length) {
            throw new RuntimeException("Arrays have to be even");
        }
        if (array1 == null || array2 == null ) {
            throw new RuntimeException("cant be null!");
        }
        int[] resArr = new int[array1.length];
        for (int i = 0; i < array1.length; i++){
            resArr[i] = array2[i] - array1[i];
        }
        return resArr;

    }

}
