
import java.util.Date;

/**
 * Вычисдение
 *
 * @author var541b on 02.03.2016
 *
 *
 */
public class Task4 {

    public static void main(String[] args) {
        int n = 3;
        int t = 0;

        while (t <= 10000) {
            long t1 = System.currentTimeMillis();
            fib(n);
            long t2 = System.currentTimeMillis();
            n++;
            t = (int) (t2 - t1);
        }
        System.out.println(" " + n);
    }

    static int fib(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return (n - 1) * n;
        }
    }

}
