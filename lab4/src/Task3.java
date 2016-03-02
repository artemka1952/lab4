/*
Создать метод, который будет сортировать указанный массив по 
возрастанию любым известным вам способом.
 */

/**
 * @author var1541b
 */
public class Task3 {

    public static void main(String[] args) {
        int[] a = {3, 8, 1, 7, 2, 6, 5, 0, 9, 4};
        int i = 0;
        System.out.print("Исходный: ");
     for (i = 0; i <10; i++) {
            System.out.print(a[i] + " ");}
        for (i = 0; i < 10; i++) {
            sort(a);
        }
        System.out.println();
        System.out.print("Сортированный: ");
        for (i = 0; i <10; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void sort(int a[]) {
        int i = 0, m = 0;
        for (i = 9; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    m = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = m;
                }
            }
        }
    }
}
