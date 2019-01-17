import java.util.Scanner;

/**Написать программу, которая будет выводить таблицу умножения для введенного пользователем числа с клавиатуры.*/

public class Final_Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для вывода на экран таблицы умножения: ");
        int scan = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            int multiply = scan * i;
            System.out.println(scan + "x" + i + "= " + multiply);

        }
    }
}
