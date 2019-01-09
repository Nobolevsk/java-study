import java.util.Scanner;

/** Задание №8: Ввод/вывод данных для массива
 Произведите ввод данных с клавиатуры в массив,
 а после этого произведите вывод массива на экран, где каждый элемент массива умножается на 2.*/

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int mas[] = new int[4];
        System.out.println("Введите данные массива");

        mas[0] = scanner.nextInt();
        mas[1] = scanner.nextInt();
        mas[2] = scanner.nextInt();
        mas[3] = scanner.nextInt();

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]*2);
        }

    }
}
