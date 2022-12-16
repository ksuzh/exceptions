// Разработайте программу, которая выбросит Exception, 
// когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя. 
// (try быть не должно)

package homework2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input string: ");
        String myString = sc.nextLine();
        
        if (myString.length() == 0) {
            throw new RuntimeException("empty strings arent allowed");
        }
        ;
    }
}
