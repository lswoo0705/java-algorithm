package algorithm.programmers1.test_01to20;

public class Test_14_FindKimInSeoul {
    public String solution(String[] seoul) {
        int x = 0;
//        String answer = "김서방은 " + x + "에 있다"; // for문 전에 문자열을 만들어버리면 x의 값은 0으로 고정되어있기 때문에 for문 다음에 업데이트 해주어야 한다.
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;
            }
        }
        return "김서방은 " + x + "에 있다";
    }
}
