import java.util.Arrays;
import java.util.Scanner;

/** Задание №9: Ввод/вывод данных для матрицы
 Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
 где каждый элемент умножается на 3.*/

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Введите 2 числа для матрицы: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();*/

        int mas[][] = new int[3][3];
        System.out.println("Введите строки матрицы");
        mas[0][0] = scanner.nextInt();
        mas[0][1] = scanner.nextInt();
        mas[0][2] = scanner.nextInt();
        System.out.println("Введите столбец матрицы");
        mas[0][0] = scanner.nextInt();
        mas[1][0] = scanner.nextInt();
        mas[2][0] = scanner.nextInt();

        for (int i = 0; i < mas.length; ++i) {
            for (int j = 0; j < mas[i].length; ++j) {
                //mas[i][j] = (i*j)+i+j+1;
               // System.out.print(mas[i][j] + " ");
            }
            int row = mas[i][0];
            System.out.print(row*3 + " ");
        }
    }
}
