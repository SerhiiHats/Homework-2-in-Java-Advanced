import color.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**Домашнее задание 2
 * Задание 2 *
 * Используя коллекцию удвойте слово: *
 * 1.       Введите с клавиатуры 5 слов в список строк.
 * 2.       Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c. *
 * 3.       Используя цикл for выведите результат на экран, каждое значение с новой строки.
 */


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите   " + Color.GREEN + (i + 1) + "-е " + Color.DEFAULT + "слово: ");
            list.add(scanner.next());
        }

        for (int i = 0; i < list.size(); i++) {
         list.set(i, doubleValues(list.get(i)));
        }

        System.out.println(Color.RED + "Полученый результат х2 удвоинные слова:" + Color.DEFAULT);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Результат " + Color.GREEN + (i + 1) + "-е " + Color.DEFAULT + "слово: " + Color.GREEN + list.get(i) + Color.DEFAULT);
        }
    }

    private static String doubleValues(String next) {
        StringBuilder strBild = new StringBuilder();
       for (int i = 0; i < next.length(); i++){
           strBild.append(next.charAt(i));
           strBild.append(next.charAt(i));
       }
        return strBild.toString();
    }
}
