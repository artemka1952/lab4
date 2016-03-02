
import java.util.Date;

/**
 *
 * @author var541b on 02.03.2016
 *
 *
 */
public class Task4 {

    public static void main(String[] args) {
        int n = 3;
        Date t2, t1;
        while (true) {
            t1 = new Date();
            fib(n);
            t2 = new Date();
            n++;
            if ((t2.getTime()-t1.getTime())/1000 > 60) {
                System.out.println(n);
                break;
            }
        }
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
