package programmers.programmers1.test_61to80;

public class Test_73_RecommendNewID {
    public String solution(String new_id) {
        // 1단계 : 모든 대문자를 소문자로
        new_id = new_id.toLowerCase();

        // 2단계 : 소문자, 숫자, -, _, .를 제외한 모든 문자를 제거 -> ...bat..y.abcdefghijklm
        new_id = new_id.replaceAll("[^a-z0-9\\-_\\.]", "");

        // 3단계 : 마침표가 2번 이상 연속되면 하나로 치환
        new_id = new_id.replaceAll("\\.{2,}", ".");

        // 4단계 : 마침표가 처음 또는 마지막에 위치한다면 제거
        if (!new_id.isEmpty() && new_id.charAt(0) == 46) {
            new_id = new_id.substring(1);
        }
        if (!new_id.isEmpty() && new_id.charAt(new_id.length() - 1) == 46) {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        // 5단계 : new_id가 빈 문자열이라면 a를 대입
        if (new_id.isEmpty()) {
            new_id = "a";
        }

        // 6단계 : 길이가 16자 이상이라면 인덱스 0~14 제외하고 뒤에 자르기
        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
        }
        // 만약 제거 후 마지막이 마침표라면 마침표를 제거
        if (new_id.charAt(new_id.length() - 1) == 46) {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        // 7단계 : 길이가 2자 이하라면 마지막 문자를 길이가 3이 될때까지 반복
        StringBuilder sb = new StringBuilder(new_id);
        while (sb.length() < 3) {
            sb.append(new_id.charAt(new_id.length() - 1));
        }
        new_id = sb.toString();

        return new_id;
    }

    public static void main(String[] args) {
        Test_73_RecommendNewID sol = new Test_73_RecommendNewID();
//        String new_id = "...!@BaT#*..y.abcdefghijklm.."; // "bat.y.abcdefghi"
//        String new_id = "z-+.^."; // "z--"
        String new_id = "=.="; // "aaa"
//        String new_id = "123_.def"; // "123_.def"
//        String new_id = "abcdefghijklmn.p"; // "abcdefghijklmn"
        System.out.println(sol.solution(new_id));
    }
}
