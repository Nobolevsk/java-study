import java.util.Arrays;
import java.util.Scanner;

/**Написать программу сортировки по возрастанию заданного пользователем массива чисел*/

public class Final_Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Задайте длину масива (число): ");
        int leng_mass = scanner.nextInt();
        int[] mas = new int[leng_mass];

        System.out.println("Длина массива: "+ leng_mass +"\nНаполните массив числами: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(Arrays.toString(mas) + " массив = ");
            int scan_num = scanner.nextInt();
            mas[i] = scan_num;
        }
        System.out.println("Заполненный массив выглядит следующим образом: \n"+Arrays.toString(mas));

        for (int i = mas.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j]>mas[j+1]){
                    int v = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = v;
                }
            }
        }
        System.out.println("С помощью пузырьковой сортировки получили следующий набор массивов: \n"+Arrays.toString(mas));
    }
}
