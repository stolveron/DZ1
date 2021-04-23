// 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
package dz;

public class ChetvertoeZadanie {
    public static void main(String[] args){
}
    static boolean calc(int a, int b) {
        int sum = a + b;
        return sum > 9 && sum <= 20;
    }
}
