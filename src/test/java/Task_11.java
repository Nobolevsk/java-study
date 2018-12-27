import org.hamcrest.core.IsNull;

import java.util.Scanner;

/** Задача №11: Удаление всех пробелов в заданном тексте Задание
 Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран*/

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с пробелами: ");
        String a = scanner.nextLine();

        char[] b = a.toCharArray();
        char d = '\0';

        for (int i = 0; i < a.length(); i++) {
            if (b[i] == ' ') {
                b[i] = d;
            }
        }
        String w = new String(b);
        System.out.println("Строка без пробелов имеет следующий вид: " +w);

    }
}