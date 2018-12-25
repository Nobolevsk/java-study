import java.util.Scanner;

/** Задание №8: Ввод/вывод данных для массива
 Произведите ввод данных с клавиатуры в массив,
 а после этого произведите вывод массива на экран, где каждый элемент массива умножается на 2.*/

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для размера массива: ");
        int a = scanner.nextInt();

        int mas[] = new int[a];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i;

            System.out.println(mas[i]*2);
        }

    }
}
