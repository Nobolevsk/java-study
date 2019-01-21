import java.io.*;
import java.util.Scanner;

/** Задача №17: Выгрузка данных из файла, проверка и перезапись.
 Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
 а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
 Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.*/

public class Task_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\programming\\gitrepo\\java-study\\src\\test\\resources\\file3.txt"));
            int count = 0;
            while ((file = reader.readLine()) != null) {
                System.out.println(file);
                count++;
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Documents\\programming\\gitrepo\\java-study\\src\\test\\resources\\file3.txt", false));
            System.out.println("Введите текст для перезаписи: ");
            for (int i = 0; i < count; i++) {
                writer.write(scanner.nextLine());
                writer.newLine();
            }

            scanner.close();
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}