package programmers.programmers0.test_181to200;

import java.util.Arrays;

public class Test_182_ErrandForCoffee {
    public int solution(String[] order) {
//        int americanoCount = 0;
//        int cafelatteCount = 0;
//
//        for (int i = 0; i < order.length; i++) {
//            if (order[i].contains("cafelatte")) {
//                cafelatteCount++;
//            } else {
//                americanoCount++;
//            }
//        }
//
//        return cafelatteCount * 5000 + americanoCount * 4500;

        // stream 사용
        int cafelatteCount = (int) Arrays.stream(order)
                .filter(o -> o.contains("cafelatte"))
                .count();
        int americanoCount = order.length - cafelatteCount;

        return cafelatteCount * 5000 + americanoCount * 4500;
    }
}
