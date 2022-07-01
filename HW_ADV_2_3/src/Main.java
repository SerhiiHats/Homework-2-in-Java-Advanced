import color.Color;
import java.util.*;

/**
 * Домашнее задание 2
 * Задание 3
 * Минимальное из N чисел(использовать LinkedList):
 * 1.       Ввести с клавиатуры число N.
 * 2.       Считать N целых чисел и заполнить ими список - метод getIntegerList.
 * 3.       Найти минимальное число среди элементов списка - метод getMinimum.
 */

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.print ("Введите количество цифр которые необходимо добавить в LinkedList: ");
        int number = enterNumber();
        getIntegerList(list, number);
        System.out.print("1. Выведем на экран заполненный LinkedList    : " + Color.GREEN);
        for (Integer g : list) {
            System.out.print(g + " ");
        }
        System.out.println();
        System.out.println(Color.DEFAULT + "2. Минимальное число в LinkedList             : " + Color.GREEN + getMinimum(list) + Color.DEFAULT);

    }
    /**
     * Первый вариант реализиции метода getMinimum.
     */
    private static int getMinimum(LinkedList<Integer> list) {
        int minNumber = list.getFirst();
        for (Integer g : list) {
            if (minNumber > g) {
               minNumber = g;
            }
        }
        return minNumber;
    }

    /**
     * Второй вариант реализиции метода getMinimum.
     */
//    private static int getMinimum(LinkedList<Integer> list) {
//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });
//        return list.getFirst();
//    }

    private static void getIntegerList(LinkedList<Integer> list, int number) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            System.out.print("Введите  " + Color.GREEN + (i + 1) + "-е " + Color.DEFAULT + "целое число: ");
            list.add(enterNumber());
        }
        scanner.close();
    }


    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.print("Данные не приняты. Введите еще раз число: ");
                scanner.next();
            }
        }

    }
}
