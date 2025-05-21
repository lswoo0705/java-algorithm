package baekjoon.level7;

import java.io.*;

public class Test_03_ReadVertically {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 단어들을 담을 배열
        String[] wordArr = new String[5];
        int maxLength = 0;

        // 입력값을 순환하며 배열에 저장, 문자열의 최대 길이 저장
        for (int i = 0; i < 5; i++) {
            wordArr[i] = br.readLine();
            maxLength = Math.max(maxLength, wordArr[i].length());
        }

        // 세로로 출력
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < wordArr[j].length()) {
                    bw.write(wordArr[j].charAt(i));
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
