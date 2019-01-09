import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/** Задача №15: Выгрузка данных из файла на экран
 Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt */


public class Task_15 {
    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String s = reader.readLine();
            while (s != null)
                System.out.println(s);
        }
        catch (IOException a){
            System.out.println(a.getMessage());
        }
    }

}
