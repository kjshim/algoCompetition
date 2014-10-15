package kyujin;

import kyujin.MyInputReader;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, MyInputReader in, PrintWriter out) {
        int n = in.readInt();
        int m = in.readInt();
        for(int i=0; i<10000; i++){
            int a = i;
            int b = n - a;
            if(b%2 != 0 || b < 0) continue;
            b = b / 2;
            if((a + b) % m ==0) {
                out.print(a+b);
                out.println();
                return;
            }
        }
        out.printf("-1\n");
    }
}
