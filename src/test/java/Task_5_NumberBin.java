import java.util.Scanner;

public class Task_5_NumberBin {
    public static void main(String[] args) {
        // Ввести с консоли число в бинарном формате. Перевести его в int и вывести на экран

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите число в бинарном формате: ");
        String b = scanner.nextLine();

        int q = Integer.parseInt(b, 2);
        System.out.println("Бинарное число в формате int = "+q);

    }
}
