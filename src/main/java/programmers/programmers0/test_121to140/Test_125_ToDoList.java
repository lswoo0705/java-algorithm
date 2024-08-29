package programmers.programmers0.test_121to140;

import java.util.ArrayList;
import java.util.List;

public class Test_125_ToDoList {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answerList = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answerList.add(todo_list[i]);
            }
        }

        return answerList.toArray(new String[0]);
    }
}
