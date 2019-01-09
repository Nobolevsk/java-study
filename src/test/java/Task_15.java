import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** Задача №15: Выгрузка данных из файла на экран
 Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt */


public class Task_15 {
    public static void main(String[] args) {

        String s;
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\programming\\gitrepo\\java-study\\src\\test\\resources\\file.txt"))) {
            while ((s = reader.readLine()) != null)
                System.out.println(s);
        }
        catch (IOException a){
            System.out.println(a.getMessage());
        }
    }

}
