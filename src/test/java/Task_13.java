import java.util.Scanner;

/** Задача №13: Преобразование типов
 Необходимо написать программу, которая будет реализовывать следующие действия:
     1. Ввод числа с клавиатуры и запись его в строковую переменную S
     2. Конвертация строковой переменной S в числовую переменную X типа int
     3. Конвертация числа X типа int в число Y типа double
 Все три числа разных типов необходимо в столбик вывести на экран*/

public class Task_13 {
    public static void main(String[] args) {
        // 1. Ввод числа с клавиатуры и запись его в строковую переменную S
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        /*int a = scanner.nextInt();
        String S = String.valueOf(a);*/

        String S = scanner.next();
        System.out.println(" Строковая переменная S = " + S);

        // 2. Конвертация строковой переменной S в числовую переменную X типа int
        int X = Integer.parseInt(S);
        System.out.println(" Числовая переменная X = " + X);
        // 3. Конвертация числа X типа int в число Y типа double
        double Y = (double) X;
        System.out.println(" Double переменная Y = " + Y);

        // Все три числа разных типов необходимо в столбик вывести на экран
        System.out.println(S +"\n"+ X +"\n"+ Y);
    }
}
