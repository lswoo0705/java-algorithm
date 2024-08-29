package programmers.programmers1.test_21to40;

public class Test_25_CalculateInsufficientAmount {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;
        for (int i = 0; i < count; i++) {
            totalPrice += (long) (i + 1) * price;
        }
        if (totalPrice - money > 0) {
            return totalPrice - money;
        } else {
            return 0;
        }
    }
}
