package programmers.programmers2.test_21to40;

import java.util.HashMap;
import java.util.Map;

public class Test_31_ListOfPhoneNumbers {
    public boolean solution(String[] phone_book) {
        // 해시
        Map<String, Integer> map = new HashMap<>();

        // 모든 번호를 HashMap에 넣기
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        // 모든 번호를 잘랐을 때 map에 존재하는지 확인
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }
}
