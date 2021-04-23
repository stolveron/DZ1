// 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
package dz;

public class PyatoeZadanie {
    public static void main(String[] args){

    }
    static void pyati(int a) {
        String s = "Положительное";
        if (a < 0) s = "Отрицательное";

        System.out.println(s);
    }
}
