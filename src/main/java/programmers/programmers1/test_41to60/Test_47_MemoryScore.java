package programmers.programmers1.test_41to60;

public class Test_47_MemoryScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                for (int k = 0; k < name.length; k++) {
                    if (name[k].equals(photo[i][j])) {
                        answer[i] += yearning[k];
                    }
                }
            }
        }
        return answer;
    }
}
