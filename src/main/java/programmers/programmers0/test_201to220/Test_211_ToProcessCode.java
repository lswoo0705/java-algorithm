package programmers.programmers0.test_201to220;

public class Test_211_ToProcessCode {
    public String solution(String code) {
        String answer = "";
        StringBuilder ret = new StringBuilder();
        boolean mode = false;

        for (int i = 0; i < code.length(); i++) {
            if (!mode) {
                if (code.charAt(i) != '1' && i % 2 == 0) {
                    ret.append(code.charAt(i));
                } else if (code.charAt(i) == '1') {
                    mode = true;
                }
            } else {
                if (code.charAt(i) != '1' && i % 2 == 1) {
                    ret.append(code.charAt(i));
                } else if (code.charAt(i) == '1') {
                    mode = false;
                }
            }
        }

        answer = ret.toString();

        if (ret.length() == 0) {
            answer = "EMPTY";
        }
        
        return answer;
    }
}
