import color.Color;

import java.util.*;
/**Домашнее задание 2
Задание 3
 Минимальное из N чисел(использовать LinkedList):
 1.       Ввести с клавиатуры число N.
 2.       Считать N целых чисел и заполнить ими список - метод getIntegerList.
 3.       Найти минимальное число среди элементов списка - метод getMinimum.
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        long number_N = enterNumber();
        getIntegerList(list, number_N);

        System.out.print("1. Выведем на экран заполненный LinkedList    : " + Color.GREEN);
        for (Integer g : list) {
            System.out.print(g + " ");
        }

        System.out.println();
        System.out.println(Color.DEFAULT + "2. Минимальное число в LinkedList             : " + Color.GREEN + getMinimum(list) + Color.DEFAULT);

       // System.out.println();
        System.out.print("3. Выведем на экран отсортированый LinkedList : " + Color.GREEN);
        for (Integer g : list) {
            System.out.print(g + " ");
        }
        System.out.println(Color.DEFAULT);

    }

    private static long enterNumber() {
        Scanner scanner = new Scanner(System.in);
        long number;
        System.out.println("Введите целое число:");
        while (true) {
            if (scanner.hasNextLong()) {
                number = scanner.nextLong();
                break;
            } else {
                System.out.println("Ошибка ввода целого числа, проверте и повторите");
                scanner.next();
            }
        }
        scanner.close();
        return number;
    }

    private static int getMinimum(List<Integer> list) {
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            return (int)iterator.next();
        }
     return 0;
    }

    private static void getIntegerList(List<Integer> list, long chisloN) {
        String str = String.valueOf(chisloN);
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i) - '0');
        }
    }
}
