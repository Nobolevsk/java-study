import java.util.Scanner;

/** Задача №12: Сравнение двух строк
 Необходимо провести сравнение длинны двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
 Вывести на экран строку с наибольшей длинной.*/

public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку: ");
        String a = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String b = scanner.nextLine();

        int c = a.length();
        int d = b.length();

        if (c>d){
            System.out.println("Длина строк: "+a.length() + ">" + b.length());
            System.out.println("Первая строка является с наибольшей длиной - " +a.length());
        } else if (c<d){
            System.out.println("Длина строк: "+a.length() + "<" + b.length());
            System.out.println("Вторая строка является с наибольшей длиной - " +b.length());
        }
        else System.out.println("Длина строк равна: "+ a.length() + "=" + b.length());

    }
}
