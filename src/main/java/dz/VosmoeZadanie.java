// 8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
package dz;
import java.util.Scanner;

public class VosmoeZadanie {
    public static void main(String[] args) {

        System.out.println("Введите год для проверки =  ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
            scan.close();
        }
    }
}
