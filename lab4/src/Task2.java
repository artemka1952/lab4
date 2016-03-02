
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;

/*
Создать метод, который будет выводить указанный массив на экран в строку. С 
помощью созданного метода и метода из предыдущей задачи заполнить 5 массивов из 
10 элементов каждый случайными числами и вывести все 5 массивов на экран, 
каждый на отдельной строке.
 */
/**
 * @author var1541b
 */
public class Task2 {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i = 0, c = 0, b = 0, d = 0;
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        int[] a3 = new int[10];
        int[] a4 = new int[10];
        int[] a5 = new int[10];

        String b_str = null;
        try {
            b_str = in.readLine();//читаем строку с клавиатуры
            b = Integer.parseInt(b_str);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода 1 числа");
        }

        String c_str = null;
        try {
            c_str = in.readLine();
            c = Integer.parseInt(c_str);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода 2 числа");
        }
        if (b > c) {
            d = c;
            c = b;
            b = d;
        }
        for (i = 0; i < 10; i++) {
            a1[i] = otr(b, c);
            a2[i] = otr(b, c);
            a3[i] = otr(b, c);
            a4[i] = otr(b, c);
            a5[i] = otr(b, c);
        }
        vivod(a1);
        vivod(a2);
        vivod(a3);
        vivod(a4);
        vivod(a5);
    }

    public static int otr(int a, int b) {
        return (int) (Math.random() * (b - a + 1) + a);
    }

    public static void vivod(int a[]) {
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
