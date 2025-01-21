package programmers.programmers2.test_41to60;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test_54_OpenChatRoom {
    public String[] solution(String[] record) {
//        // 메시지 수 계산
//        int numOfMessage = 0;
//        for (String s : record) {
//            if (s.startsWith("Enter") || s.startsWith("Leave")) {
//                numOfMessage++;
//            }
//        }
//        String[] answer = new String[numOfMessage];
//
//        // 유저 아이디와 닉네임 매핑
//        List<String[]> actions = new ArrayList<>();
//        List<String[]> nicknameHistory = new ArrayList<>();
//
//        for (String entry : record) {
//            String[] parts = entry.split(" ");
//            String command = parts[0];
//            String uid = parts[1];
//
//            switch (command) {
//                case "Enter" -> {
//                    updateNickname(nicknameHistory, uid, parts[2]); // 닉네임 업데이트
//                    actions.add(new String[]{uid, "님이 들어왔습니다."});
//                }
//                case "Leave" -> actions.add(new String[]{uid, "님이 나갔습니다."});
//                case "Change" -> updateNickname(nicknameHistory, uid, parts[2]); // 닉네임 변경
//            }
//        }
//
//        // 결과 메시지 작성
//        int idx = 0;
//        for (String[] action : actions) {
//            String uid = action[0];
//            String nickname = findLatestNickname(nicknameHistory, uid);
//            answer[idx++] = nickname + action[1];
//        }
//
//        return answer;
//    }
//
//    // 닉네임 업데이트 메서드
//    private void updateNickname(List<String[]> nicknameHistory, String uid, String nickname) {
//        boolean found = false;
//        for (String[] entry : nicknameHistory) {
//            if (entry[0].equals(uid)) {
//                entry[1] = nickname;
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            nicknameHistory.add(new String[]{uid, nickname});
//        }
//    }
//
//    // 최신 닉네임 찾기 메서드
//    private String findLatestNickname(List<String[]> nicknameHistory, String uid) {
//        for (String[] entry : nicknameHistory) {
//            if (entry[0].equals(uid)) {
//                return entry[1];
//            }
//        }
//        return "";

        // 실패(시간 초과)

        // -------------- 해시맵 사용 -------------


        // 유저 아이디와 닉네임 매핑을 저장할 Map
        Map<String, String> userNicknames = new HashMap<>();
        List<String[]> actions = new ArrayList<>();

        for (String entry : record) {
            String[] parts = entry.split(" ");
            String command = parts[0];
            String uid = parts[1];

            if (command.equals("Enter")) {
                userNicknames.put(uid, parts[2]); // 닉네임 갱신
                actions.add(new String[]{uid, "님이 들어왔습니다."});
            } else if (command.equals("Leave")) {
                actions.add(new String[]{uid, "님이 나갔습니다."});
            } else if (command.equals("Change")) {
                userNicknames.put(uid, parts[2]); // 닉네임 변경
            }
        }

        // 결과 메시지 작성
        String[] answer = new String[actions.size()];
        int idx = 0;

        for (String[] action : actions) {
            String uid = action[0];
            String message = userNicknames.get(uid) + action[1];
            answer[idx++] = message;
        }

        return answer;
    }
}
