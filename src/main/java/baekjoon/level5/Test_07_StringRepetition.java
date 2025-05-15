package baekjoon.level5;

import java.io.*;
import java.util.StringTokenizer;

public class Test_07_StringRepetition {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = toInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repetition = toInt(st.nextToken());
            String word = st.nextToken();

            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < repetition; k++) {
                    bw.write(word.charAt(j));
                }
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
