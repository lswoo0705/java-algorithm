package baekjoon.level6;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Test_07_GroupWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfWords = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < numOfWords; i++) {
            Set<Character> set = new HashSet<>();
            String word = br.readLine();
            char prevAlph = 0;
            boolean isGroupWord = true;

            for (int j = 0; j < word.length(); j++) {
                char curAlph = word.charAt(j);

                if (curAlph != prevAlph) {
                    if (set.contains(curAlph)) {
                        isGroupWord = false;
                        break;
                    }

                    set.add(curAlph);
                    prevAlph = curAlph;
                }
            }

            if (isGroupWord) {
                count++;
            }
        }

        System.out.println(count);
    }
}
