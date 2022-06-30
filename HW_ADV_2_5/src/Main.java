import color.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**Домашнее задание 2
 Задание 5
 Вводить с клавиатуры строки, пока пользователь не введёт строку 'end':
 1.       Создать список строк.
 2.       Ввести строки с клавиатуры и добавить их в список.
 3.       Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
 4.       Вывести строки на экран, каждую с новой строки.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Ввeдите с клавиатуры строку " + Color.GREEN + "/ что бы закончить введите \"end\"" + Color.DEFAULT);
            String stroka = scanner.nextLine();
            if (stroka.equalsIgnoreCase("end")) {
                break;
            }
            list.add(stroka);
        }
        System.out.println("__________ вывод строк на экран __________");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
