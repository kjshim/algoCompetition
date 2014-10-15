package kyujin;

import kyujin.MyInputReader;
import java.io.PrintWriter;

public class TaskB {
    public long fact(int n){
        long v = 1;
        for(int i=1; i <=n; i++) v = v * i;
        return v;
    }

    public void solve(int testNumber, MyInputReader in, PrintWriter out) {
        String org = in.readLine();
        String dst = in.readLine();

        int n = org.length();
        int orgPlus = 0;
        int orgMinus = 0;
        int dstPlus = 0;
        int dstMinus = 0;
        int dstQ = 0;

        for(char c:org.toCharArray()) {
            if(c == '+') orgPlus ++;
            if(c == '-') orgMinus ++;
        }
        for(char c:dst.toCharArray()) {
            if(c == '+') dstPlus ++;
            if(c == '-') dstMinus ++;
            if(c == '?') dstQ ++;
        }
        int k = dstQ;
        int v = (orgPlus - orgMinus) - (dstPlus - dstMinus);
        if(Math.abs(v) > Math.abs(k) || ((k - v) % 2 != 0)) {
            out.printf("%.12f", 0.0d);
        } else {
            int cnt = ((k - v) / 2);
            long cp = fact(k) / fact(cnt) / fact(k-cnt);
            double p = 0.5d;
            double result = cp * Math.pow(p, cnt) * Math.pow(p, k - cnt);
            out.printf("%.12f", result);
        }

    }
}
