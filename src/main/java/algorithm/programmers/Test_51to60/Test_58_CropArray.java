package algorithm.programmers.Test_51to60;

public class Test_58_CropArray {
    public String[] solution(String my_str, int n) {
        int indexLength = 0;                        // answer 인덱스의 길이 결정
        if (my_str.length() % n == 0) {             // 문자열의 길이가 n으로 나누어 떨어진다면
            indexLength = my_str.length() / n;      // 인덱스의 길이는 n으로 나눈 값이 되고
        } else {                                    // 문자열의 길이가 n으로 나누어 떨어지지 않는다면
            indexLength = my_str.length() / n + 1;  // 인덱스의 길이는 n으로 나눈 값의 +1
        }
        String[] answer = new String[indexLength];

        for (int i = 0; i < indexLength; i++) {
            if (my_str.length() >= n) {                             // 문자열의 길이가 n보다 크거나 같다면
                answer[i] = my_str.substring(0, n);                 // i번째 인덱스는 my_str의 0~n번째 위치만큼 자른다
                my_str = my_str.substring(n, my_str.length());      // 그리고 my_str은 위에서 자르고 남은것으로
            } else {                                                // 문자열의 길이가 n보다 작다면
                answer[i] = my_str;                                 // answer는 my_str 그대로
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_58_CropArray sol = new Test_58_CropArray();
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        System.out.println(sol.solution(my_str, n));
    }
}
