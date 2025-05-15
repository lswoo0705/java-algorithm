package baekjoon.level5;

import java.io.*;

public class Test_11_PrintAsItIs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while ((str = br.readLine()) != null) {
            bw.write(str);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
