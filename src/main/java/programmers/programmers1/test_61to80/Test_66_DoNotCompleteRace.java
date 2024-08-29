package programmers.programmers1.test_61to80;

import java.util.HashMap;

public class Test_66_DoNotCompleteRace {
    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//
//        List<String> participantList = new ArrayList<>(Arrays.asList(participant));
//
//        for (int i = 0; i < completion.length; i++) {
//            participantList.remove(completion[i]);
//        }
//
//        answer = participantList.get(0);
//
//        return answer;
        // -> 효율성 테스트에서 시간초과

        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}
