package baekjoon.level5;

import java.io.*;

public class Test_06_FindingAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        for (int i = 97; i < 123; i++) { // 소문자 아스키코드 범위
            if (s.contains(String.valueOf((char) i))) { // 소문자가 s에 포함되어있다면
                int charIndex = 0; // 해당 소문자의 s에서의 인덱스 찾기
                for (int j = 0; j < s.length(); j++) {
                    if (((char) i) == (s.charAt(j))) {
                        charIndex = j;
                        break;
                    }
                }
                bw.write(charIndex + " ");
            } else {
                bw.write(-1 + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
