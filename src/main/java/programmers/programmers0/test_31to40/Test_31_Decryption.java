package programmers.programmers0.test_31to40;
public class Test_31_Decryption {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] arr = cipher.split("");
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % code == 0) {
                answer += arr[i];
            }
        }
        return answer;
    }
}
