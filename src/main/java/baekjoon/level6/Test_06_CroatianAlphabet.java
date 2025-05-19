package baekjoon.level6;

import java.io.*;

public class Test_06_CroatianAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int totalCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char alphabet = word.charAt(i);

            // "dz=" 확인
            if (alphabet == 'd') {
                if (i + 2 < word.length()
                        && word.charAt(i + 1) == 'z'
                        && word.charAt(i + 2) == '=') {
                    totalCount++;
                    i += 2;
                    continue;
                }
            }

            // 나머지 확인
            if (i + 1 < word.length()) {
                String target = word.substring(i, i + 2);
                if (target.equals("c=") || target.equals("c-")
                        || target.equals("d-") || target.equals("lj")
                        || target.equals("nj") || target.equals("s=")
                        || target.equals("z=")) {
                    totalCount++;
                    i += 1;
                    continue;
                }
            }

            totalCount++;
        }

        System.out.println(totalCount);
    }
}
