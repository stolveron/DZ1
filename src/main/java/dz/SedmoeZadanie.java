// 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
package dz;
import java.util.Scanner;

public class SedmoeZadanie {
    public static void main(String[] args) {

        Scanner imya = new Scanner(System.in);
        System.out.println("Введите своё имя: ");
        String name = imya.next();
        System.out.println("Привет, " + name);
        imya.close();
    }
}
