package algorithm.programmers0.test_31to40;

public class Test_38_IndexChange {
    public String solution(String my_string, int num1, int num2) {
        // 각 인덱스에 해당하는 문자를 저장
        char str1 = my_string.charAt(num1);
        char str2 = my_string.charAt(num2);

        // 문자열을 문자 배열로 바꾼 뒤 값 입력
        char[] myChar = my_string.toCharArray();
        myChar[num1] = str2;
        myChar[num2] = str1;

        // 문자 배열을 문자열로 변환
        String answer = String.valueOf(myChar);

        return answer;
    }

    public static void main(String[] args) {
        Test_38_IndexChange sol = new Test_38_IndexChange();
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        System.out.println(sol.solution(my_string, num1, num2));
    }
}
