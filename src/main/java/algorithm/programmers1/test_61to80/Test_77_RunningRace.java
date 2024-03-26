package algorithm.programmers1.test_61to80;

import java.util.HashMap;

public class Test_77_RunningRace {
    public String[] solution(String[] players, String[] callings) {
//        for (String calling : callings) {
//            int rank;
//            String overtaken;
//            rank = Arrays.asList(players).indexOf(calling);
//            overtaken = players[rank - 1];
//            players[rank - 1] = players[rank];
//            players[rank] = overtaken;
//        }
//
//        return players;

        // 테스트 케이스 10, 11, 12, 13 시간초과

        HashMap<String, Integer> playerIndices = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndices.put(players[i], i);
        }

        for (String calling : callings) {
            int rank = playerIndices.get(calling);
            if (rank > 0) {
                String overtaken = players[rank - 1];
                players[rank - 1] = calling;
                players[rank] = overtaken;
                playerIndices.put(calling, rank - 1);
                playerIndices.put(overtaken, rank);
            }
        }

        return players;
    }
}
