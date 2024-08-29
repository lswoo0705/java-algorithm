package programmers.programmers1.test_61to80;

public class Test_69_MakingHamburger {
    public int solution(int[] ingredient) {
//        int answer = 0;
//        String hamburger = "1231";
//
//        String ingreStr = Arrays.toString(ingredient).replaceAll("[^0-9]","");
//
//
//        while (ingreStr.contains(hamburger)) {
//            int hamIndex = ingreStr.indexOf(hamburger);
//            ingreStr = ingreStr.substring(0, hamIndex) + ingreStr.substring(hamIndex + 4);
//            answer++;
//        }
//
//        return answer;

        // 테스트 케이스 4, 5, 12번 시간초과로 틀림   83.3 / 100

        // ================================================

//        int answer = 0;
//        String hamburger = "1231";
//
//        StringBuilder ingreSB = new StringBuilder();
//
//        for (int j : ingredient) {
//            ingreSB.append(j);
//        }
//
//        String ingreStr = ingreSB.toString();
//
//        while (ingreStr.contains(hamburger)) {
//            int hamIndex = ingreStr.indexOf(hamburger);
//            ingreStr = ingreStr.substring(0, hamIndex) + ingreStr.substring(hamIndex + 4);
//            answer++;
//        }
//
//        return answer;

        // 4번 케이스 통과,   5, 12번 시간초과    88.9 / 100
        // while문이 문제인듯 해서 for문에 index를 처음부터가 아닌 -3으로 바꾸기

        // ================================================

//        int answer = 0;
//        String hamburger = "1231";
//
//        StringBuilder ingreSB = new StringBuilder();
//
//        for (int j : ingredient) {
//            ingreSB.append(j);
//        }
//
//        String ingreStr = ingreSB.toString();
//
//        for (int i = 0; i < ingreStr.length() - 3; i++) {
//            if (ingreStr.substring(i, i + 4).equals(hamburger)) {
//                ingreStr = ingreStr.substring(0, i) + ingreStr.substring(i + 4);
//                answer++;
//                i -= 3;
//            }
//        }
//
//        return answer;

        // 이거는 1, 2, 18번이 시간초과;;
        // 스트링빌더에서 바로 처리하기

        // ================================================

        int answer = 0;
        String hamburger = "1231";

        StringBuilder ingreSB = new StringBuilder();

        for (int j : ingredient) {
            ingreSB.append(j);

            if (ingreSB.length() > 3 && ingreSB.substring(ingreSB.length() - 4, ingreSB.length()).equals(hamburger)) {
                ingreSB.delete(ingreSB.length() - 4, ingreSB.length());
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_69_MakingHamburger sol = new Test_69_MakingHamburger();
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
//        int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        System.out.println(sol.solution(ingredient));
    }
}
