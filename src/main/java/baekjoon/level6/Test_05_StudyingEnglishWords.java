package baekjoon.level6;

import java.io.*;
public class Test_05_StudyingEnglishWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toUpperCase();
        int[] alphabetArr = new int[26];

        for (int i = 0; i < word.length(); i++) {
            alphabetArr[word.charAt(i) - 'A']++; // 아스키코드 빼려고
        }

        int max = -1;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (alphabetArr[i] > max) {
                max = alphabetArr[i];
                result = (char) (i + 'A');
            } else if (alphabetArr[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
