import java.util.Arrays;

/** Задача №14: Сортировка данных в массиве
 Необходимо написать программу для сортировки данных массива по возрастанию.
 Использовать пузырьковый метод сортировки.*/

public class Task_14 {
    public static void main(String[] args) {
        int[] a = new int[5]; // объявление массива а

        for (int k = 0; k < a.length; k++) { //цикл k для заполнения массива
            int w = 4 + (int) (Math.random()*10);// рандомное число
            a[k] = w;
        }
        System.out.println("Первоначальных вид массива \n" + Arrays.toString(a)+"\n");// вывод массива
        System.out.println("Процесс сортировки массива пузырьковым методом↓");
        for (int i = a.length-1; i > 0; i--) { // цикл для перебора строк в массиве а
            //a[i] = i;
            for (int j = 0; j < i; j++) { // цикл для перебора столбцов(значений) в массиве а
                //a[j] = j;
                if (a[j]>a[j+1]){ // условие для пузырьковой сортировки
                    int v = a[j];
                    a[j] = a[j+1];
                    a[j+1] = v;
                }
            }
            System.out.println(Arrays.toString(a));
        }
        System.out.println("\nОтсортированный массив имеет финальный вид \n" + Arrays.toString(a)); // вывод результата массива а
    }
}
