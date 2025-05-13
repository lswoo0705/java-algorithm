package baekjoon.level4;

import java.io.*;
import java.util.StringTokenizer;

public class Test_09_FlippingTheBasket {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int basket = toInt(st.nextToken());
        int reverse = toInt(st.nextToken());
        int[] arr = new int[basket];

        for (int i = 0; i < basket; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < reverse; i++) {
            st = new StringTokenizer(br.readLine());
            int startNumIndex = toInt(st.nextToken()) - 1;
            int endNumIndex = toInt(st.nextToken()) - 1;

            while (startNumIndex < endNumIndex) {
                int temp = arr[startNumIndex];
                arr[startNumIndex] = arr[endNumIndex];
                arr[endNumIndex] = temp;
                startNumIndex++;
                endNumIndex--;
            }
        }

        for (int i = 0; i < basket; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
