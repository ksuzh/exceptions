// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных. 
// В этом задании не используем try catch. 
// Пишем регулярное выражение и используем на строке метод matches.

package homework2;
import java.util.Scanner;

public class task1 {
    static String userNum;

    public static void main(String[] args) {

        float num = inputFloatNum();
        System.out.println(num);

    }

    public static float inputFloatNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input float number: ");
        userNum = sc.next();

        while (!userNum.matches("[+-]?([0-9]*[.])?[0-9]+")) {
            System.out.println("try again, use dot: ");
            userNum = sc.next();
        }
        
      
        return Float.valueOf(userNum);
    }
    }
