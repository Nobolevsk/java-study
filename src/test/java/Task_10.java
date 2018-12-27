import java.util.Scanner;

/** Задача №10: Ввод строки с клавиатуры
 Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран. */

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String a = scanner.next();

        System.out.println("Введённая строка: "+a);
    }
}
