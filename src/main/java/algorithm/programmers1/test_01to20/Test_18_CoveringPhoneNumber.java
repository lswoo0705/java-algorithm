package algorithm.programmers1.test_01to20;

public class Test_18_CoveringPhoneNumber {
    public String solution(String phone_number) {
        String an1 = phone_number.substring(0, phone_number.length() - 4);
        an1 = an1.replaceAll("[0-9]", "*");
        String an2 = phone_number.substring(phone_number.length() - 4);
        String answer = an1 + an2;
        return answer;
    }
}
