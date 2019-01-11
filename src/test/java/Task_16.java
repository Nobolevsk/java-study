import java.io.*;

/** Задача №16: Запись данных в файл Задание
 Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
 Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
 Пользователь при тестировании программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.*/

public class Task_16 {
    public static void main(String[] args) {
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Команда \"stop\" или \"стоп\" останавливает запись в файл.\nВведите текст в файл ↓↓↓");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Documents\\programming\\gitrepo\\java-study\\src\\test\\resources\\file2.txt"));
            do {
                s = reader.readLine();
                if ((s.compareTo("stop") == 0) || (s.compareTo("стоп") == 0)) {
                    break;
                }
                writer.write(s + "\n");
            } while ((s.compareTo("stop") != 0) || (s.compareTo("стоп") != 0));

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
