package algorithm.programmers1.test_21to40;

public class Test_40_CreatingStrangeString {
    public String solution(String s) {
//        String[] strS = s.split("");
//
//        for (int i = 0; i < strS.length; i++) {
//            if (i % 2 == 0) {
//                strS[i] = strS[i].toUpperCase();
//            } else {
//                strS[i] = strS[i].toLowerCase();
//            }
//        }
//
//        String answer = String.join("", strS);
//
//        return answer;
        // 아... 전체에서가 아니라 각 단어마다 홀짝이 다시시작되는거였구나

        StringBuilder stringBuilder = new StringBuilder();
        String[] strS = s.split(" ", -1);
        for (int i = 0; i < strS.length; i++) {
            for (int j = 0; j < strS[i].length(); j++) {
                if (j % 2 == 0) {
                    stringBuilder.append(Character.toUpperCase(strS[i].charAt(j)));
                } else {
                    stringBuilder.append(Character.toLowerCase(strS[i].charAt(j)));
                }
            }
            if (i < strS.length - 1) {
                stringBuilder.append(" ");
            }
        }

        return String.valueOf(stringBuilder);

        // https://velog.io/@lswoo0705/%EC%9D%B4%EC%83%81%ED%95%9C-%EB%AC%B8%EC%9E%90-%EB%A7%8C%EB%93%A4%EA%B8%B0
    }
}
