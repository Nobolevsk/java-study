import java.io.*;

/** Задача №17: Выгрузка данных из файла, проверка и перезапись.
 Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
 а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
 Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.*/

public class Task_17 {
    public static void main(String[] args) {
        String file;
        String consol;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\programming\\gitrepo\\java-study\\src\\test\\resources\\file3.txt"));

            int count = 1;
            while ((file = reader.readLine()) != null) {
                System.out.println(file);
                count++;
            }

            BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Documents\\programming\\gitrepo\\java-study\\src\\test\\resources\\file3.txt", true));

            System.out.println("Введите текст для перезаписи: ");

            int count2 = 1;
            if (reader2.readLine() != null)
                count2++;

            while ((consol = reader2.readLine()) != null){
                if (count > count2){
                    writer.write(consol);l
                } else break;
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}