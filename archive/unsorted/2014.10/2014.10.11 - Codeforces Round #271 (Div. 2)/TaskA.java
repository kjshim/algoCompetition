package kyujin;

import kyujin.MyInputReader;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, MyInputReader in, PrintWriter out) {
        char c = in.readLine().charAt(0);
        int offset = 0;
        if(c=='R'){
            offset--;
        } else {
            offset++;
        }
        String[] key = {
                "qwertyuiop",
                "asdfghjkl;",
                "zxcvbnm,./"
        };
        char[] s = in.readLine().toCharArray();
        for(char ch:s) {
            for(int j=0;j<key.length;j++){
                if(key[j].contains(""+ch)){
                    int idx = key[j].indexOf(ch);
                    idx = (key[j].length() + idx + offset) % key[j].length();
                    out.print(key[j].charAt(idx));
                }
            }
        }
        out.println();
    }
}
