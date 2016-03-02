
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;

/*
 Создать статический метод, который будет иметь два целочисленных параметра 
 a и b, и в качестве своего значения возвращать случайное целое число из отрезка 
 [a;b]. C помощью данного метода заполнить массив из 20 целых чисел и вывести его 
 на экран.
 */
/**
 *
 * @author var1541b
 */
public class Task1 {

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
        System.out.print(a[i]+" ");}
    }

    public static int otr(int a, int b) {
        int x = (int) (Math.random() * (b - a + 1) + a);
        return x;
    }
}
