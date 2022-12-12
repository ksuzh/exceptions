// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. 
// Необходимо посчитать и вернуть сумму элементов этого массива. 
// При этом накладываем на метод 2 ограничения: 
// метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), 
// и в каждой ячейке может лежать только значение 0 или 1. 
// Если нарушается одно из условий, метод должен бросить RuntimeException 
// с сообщением об ошибке.

package seminar1;

import javax.management.RuntimeErrorException;

public class task3 {
    public static void main(String[] args) {
        int[][] nums = {{1, 0}, {0,2}};
        sumOf(nums);
    }

    private static int sumOf(int[][] array){
        if(array==null){
            throw new RuntimeException("cant be null");    
        }
        if(array.length != array[0].length){
            throw new RuntimeException("amount of rows should be equal to amount of columns");
        }
        int sum = 0;
        for(int i = 0; i< array.length; i ++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j] != 1 && array[i][j] != 0){
                    throw new RuntimeException("elements can only be 0 or 1");
                }
                sum+=array[i][j];
            }

        }
        return sum;
    }
}
