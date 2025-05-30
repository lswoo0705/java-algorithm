package programmers.programmers2.test_41to60;

public class Test_55_NoMoreThan2Bits {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i<numbers.length; i++) {
            long result = numbers[i];
            String target = Long.toBinaryString(numbers[i]);

            if (result % 2 == 0) {
                answer[i] = result + 1;
            } else {
                int idx = target.lastIndexOf("0");

                if (idx == -1) {
                    String tmp = "10" + target.substring(1);
                    answer[i] = Long.parseLong(tmp, 2);
                } else {
                    String tmp = target.substring(0, idx) + "10" + target.substring(idx + 2);
                    answer[i] = Long.parseLong(tmp, 2);
                }
            }
        }
        return answer;
    }
}
