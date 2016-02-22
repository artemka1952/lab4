
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
 *
 * @author var1541b
 */

public class Task2 {

    public static void main(String[] args) {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i = 0, c = 0, b = 0;
        int[] a = new int[20];
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

        for (i = 0; i < 20; i++) {
                    a[i] = otr(b, c);
                    System.out.print(a[i]+" ");
        }
    }

    public static int otr(int a, int b) {
        int x = (int) (Math.random()*(b-a+1) + a);
        return x;
    }