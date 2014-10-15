package kyujin;

import kyujin.MyInputReader;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, MyInputReader in, PrintWriter out) {
        long modt = 1000000007;
        long a = in.readLong();
        long b = in.readLong();

        long res = 0;
        for(long k = 1; k <= a; k++){
            long v = (k * b + 1) % modt;
            long sum1 = (b-1) * (b) / 2 % modt;
            res = (res + (v * sum1) % modt) % modt;
        }
        out.println(res);
    }
}
