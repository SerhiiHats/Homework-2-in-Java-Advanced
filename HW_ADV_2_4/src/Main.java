import color.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**Задание 1
 Задание 4
 Программа определяет, какая семья (фамилия) живёт в городе:
 Пример ввода:
 ·         Москва
 ·         Ивановы
 ·         Киев
 ·         Петровы
 ·         Лондон
 ·         Абрамовичи
 ·         Лондон
 Пример вывода:
 ·         Абрамовичи
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> directoryOfName = new HashMap<>();
        directoryOfName.put("Москва", "Ивановы");
        directoryOfName.put("Киев", "Петровы");
        directoryOfName.put("Лондон", "Абрамовичи");
        directoryOfName.put("Париж", "Сидоровы");
        directoryOfName.put("Берлин", "Бойченко");
        directoryOfName.put("Краков", "Крипаковы");
        directoryOfName.put("София", "Митевы");
        Set<String> allKeyTheCiti = directoryOfName.keySet();
        System.out.println("Все города: " + allKeyTheCiti);

        while (true) {
            System.out.println("Ввeдите с клавиатуры название города " + Color.GREEN + "/ что бы закончить введите \"end\"" + Color.DEFAULT);
            String keyTheCiti = scanner.next();
            if (keyTheCiti.equalsIgnoreCase("end")) {
                break;
            }
            if (directoryOfName.containsKey(keyTheCiti)) {
                System.out.println("В городе " + keyTheCiti + " живет семья: " + Color.GREEN + directoryOfName.get(keyTheCiti) + Color.DEFAULT);
            } else {
                System.out.println("В справочнике не было найдено проживающих в город: " + Color.GREEN + keyTheCiti + Color.DEFAULT);
            }
        }
    }
}
