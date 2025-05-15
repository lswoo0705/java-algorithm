package baekjoon.level5;

import java.io.*;
import java.util.StringTokenizer;

public class Test_08_NumOfStr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(st.countTokens());
    }
}
