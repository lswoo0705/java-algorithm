package algorithm.programmers.Test_61to70;

public class Test_62_AlienDictionary {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;                         // 없다는 것으로 초기화

        for (String word : dic) {
            boolean allLettersPresent = true;

            for (String letter : spell) {
                if (!word.contains(letter)) {   // 포함된 것이 하나라도 없다면
                    allLettersPresent = false;  // 거짓으로 판명
                    break;                      // 바로 탈출
                }
            }

            if (allLettersPresent) {            // 모든 글자가 포함돼있다면
                answer = 1;                     // answer를 1로 정하고
                break;                          // 바로 탈출
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_62_AlienDictionary sol = new Test_62_AlienDictionary();
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
//        String[] spell = {"z", "d", "x"};
//        String[] dic = {"def", "dww", "dzx", "loveaw"};
        System.out.println(sol.solution(spell, dic));
    }
}
