package programmers.programmers1.test_61to80;

public class Test_67_TwoPersonCode {
    public String solution(String s, String skip, int index) {
    //        char[] sArray = s.toCharArray();
    //        char[] skipArray = skip.toCharArray();
    //
    //        for (int i = 0; i < sArray.length; i++) {
    //            for (int j = 0; j < skipArray.length; j++) {
    //                if (sArray[i] <= skipArray[j] && skipArray[j] <= sArray[i] + index) {
    //                    sArray[i]++;
    //                }
    //            }
    //            sArray[i] += index;
    //
    //            while (sArray[i] > 122) {
    //                sArray[i] -= 26;
    //            }
    //        }
    //
    //        String answer = new String(sArray);
    //
    //        return answer;

        // z를 넘어가더라도 index만큼 더하고나서 26을 빼주기 때문에
        // a로 돌아왔을 때 a가 skip이더라도 추가해주지 못함
        // -> 1씩 더하면서 skip과 동일하면 한번 더 진행하는 로직으로 변경

        char[] sArray = s.toCharArray();

        for (int i = 0; i < sArray.length; i++) {
            for (int k = 0; k < index; k++) {
                sArray[i]++;
                if (sArray[i] > 'z') {
                    sArray[i] -= 26;
                }
                if (skip.contains(String.valueOf(sArray[i]))) {
                    k--;
                }

            }
        }

        String answer = new String(sArray);

        return answer;
    }

    public static void main(String[] args) {
        Test_67_TwoPersonCode sol = new Test_67_TwoPersonCode();
//        String s = "aukks"; String skip = "wbqd"; int index = 5; // answer = "happy"
//        String s = "abc"; String skip = "def"; int index = 3; // answer = "ghi"
        String s = "xy"; String skip = "za"; int index = 1; // answer = "yb"
        System.out.println(sol.solution(s, skip, index));
    }
}
