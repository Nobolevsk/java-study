import java.util.Arrays;

/** Задача №14: Сортировка данных в массиве
 Необходимо написать программу для сортировки данных массива по возрастанию.
 Использовать пузырьковый метод сортировки.*/

public class Task_14 {
    public static void main(String[] args) {
        int w = 1 + (int) (Math.random()*10);
        int[] a = new int[w];

        for (int i = a.length-1; i > 0; i--) {
            a[i] = i;
            for (int j = 0; j < i; j++) {
                if (a[j]>a[j+1]){
                    int v = a[j];
                    a[j] = a[j+1];
                    a[j+1] = v;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }
}
