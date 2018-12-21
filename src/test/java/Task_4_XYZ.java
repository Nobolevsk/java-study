import java.util.Scanner;

public class Task_4_XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.Ввод трёх чисел с клавиатуры X, Y, Z
        System.out.println("Введите значение х: ");
        double x = scanner.nextDouble();
        System.out.println("Введите значение y: ");
        double y = scanner.nextDouble();
        System.out.println("Введите значение z: ");
        double z = scanner.nextDouble();

        // 2. Нахождение и вывод на экран среднего арифметического чисел X,Y,Z
        System.out.println("Среднее арифметическое число = " + ((x+y+z)/3));
        double c = (x+y+z)/3;

        // 3. Деление среднего арифметического на 2 без остатка
        int e = (int)c/2;
        System.out.println("среднего арифметическое/2 без остатка = " + (int)c/2);

        // 4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (c > 3)
            System.out.println("Программа выполнена корректно");
    }
}
