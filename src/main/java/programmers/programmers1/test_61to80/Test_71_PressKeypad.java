package programmers.programmers1.test_61to80;

public class Test_71_PressKeypad {
    public String solution(int[] numbers, String hand) {
        // 좌표값으로 노가다해보기
//        StringBuilder answer = new StringBuilder();
//        int[] left = {1, 1};
//        int[] right = {3, 1};
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == 1) {
//                left = new int[]{1, 4};
//                answer.append("L");
//            } else if (numbers[i] == 4) {
//                left = new int[]{1, 3};
//                answer.append("L");
//            } else if (numbers[i] == 7) {
//                left = new int[]{1, 2};
//                answer.append("L");
//            } else if (numbers[i] == 3) {
//                right = new int[]{3, 4};
//                answer.append("R");
//            } else if (numbers[i] == 6) {
//                right = new int[]{3, 3};
//                answer.append("R");
//            } else if (numbers[i] == 9) {
//                right = new int[]{3, 2};
//                answer.append("R");
//            } else if (numbers[i] == 2) {
//                if (Math.abs(2 - left[0]) + Math.abs(4 - left[1]) <
//                        Math.abs(2 - right[0]) + Math.abs(4 - right[1])) {
//                    left = new int[]{2, 4};
//                    answer.append("L");
//                } else if (Math.abs(2 - left[0]) + Math.abs(4 - left[1]) >
//                        Math.abs(2 - right[0]) + Math.abs(4 - right[1])) {
//                    right = new int[]{2, 4};
//                    answer.append("R");
//                } else {
//                    if (hand.equals("left")) {
//                        left = new int[]{2, 4};
//                        answer.append("L");
//                    } else {
//                        right = new int[]{2, 4};
//                        answer.append("R");
//                    }
//                }
//            } else if (numbers[i] == 5) {
//                if (Math.abs(2 - left[0]) + Math.abs(3 - left[1]) <
//                        Math.abs(2 - right[0]) + Math.abs(3 - right[1])) {
//                    left = new int[]{2, 3};
//                    answer.append("L");
//                } else if (Math.abs(2 - left[0]) + Math.abs(3 - left[1]) >
//                        Math.abs(2 - right[0]) + Math.abs(3 - right[1])) {
//                    right = new int[]{2, 3};
//                    answer.append("R");
//                } else {
//                    if (hand.equals("left")) {
//                        left = new int[]{2, 3};
//                        answer.append("L");
//                    } else {
//                        right = new int[]{2, 3};
//                        answer.append("R");
//                    }
//                }
//            } else if (numbers[i] == 8) {
//                if (Math.abs(2 - left[0]) + Math.abs(2 - left[1]) <
//                        Math.abs(2 - right[0]) + Math.abs(2 - right[1])) {
//                    left = new int[]{2, 2};
//                    answer.append("L");
//                } else if (Math.abs(2 - left[0]) + Math.abs(2 - left[1]) >
//                        Math.abs(2 - right[0]) + Math.abs(2 - right[1])) {
//                    right = new int[]{2, 2};
//                    answer.append("R");
//                } else {
//                    if (hand.equals("left")) {
//                        left = new int[]{2, 2};
//                        answer.append("L");
//                    } else {
//                        right = new int[]{2, 2};
//                        answer.append("R");
//                    }
//                }
//            } else if (numbers[i] == 0) {
//                if (Math.abs(2 - left[0]) + Math.abs(1 - left[1]) <
//                        Math.abs(2 - right[0]) + Math.abs(1 - right[1])) {
//                    left = new int[]{2, 1};
//                    answer.append("L");
//                } else if (Math.abs(2 - left[0]) + Math.abs(1 - left[1]) >
//                        Math.abs(2 - right[0]) + Math.abs(1 - right[1])) {
//                    right = new int[]{2, 1};
//                    answer.append("R");
//                } else {
//                    if (hand.equals("left")) {
//                        left = new int[]{2, 1};
//                        answer.append("L");
//                    } else {
//                        right = new int[]{2, 1};
//                        answer.append("R");
//                    }
//                }
//            }
//        }
//
//        return answer.toString();

        // ++ 좌표, case문, 메서드 따로해서 만들어보기

        StringBuilder answer = new StringBuilder();
        int[] left = {1, 1};
        int[] right = {3, 1};

        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case 1, 4, 7:
                    left = calculateCoordinates(numbers[i]);
                    answer.append("L");
                    break;
                case 3, 6, 9:
                    right = calculateCoordinates(numbers[i]);
                    answer.append("R");
                    break;
                case 2, 5, 8, 0:
                    int[] targetCoordinates = calculateCoordinates(numbers[i]);
                    int leftDistance = Math.abs(targetCoordinates[0] - left[0]) + Math.abs(targetCoordinates[1] - left[1]);
                    int rightDistance = Math.abs(targetCoordinates[0] - right[0]) + Math.abs(targetCoordinates[1] - right[1]);
                    if (leftDistance < rightDistance || (leftDistance == rightDistance && hand.equals("left"))) {
                        left = targetCoordinates;
                        answer.append("L");
                    } else {
                        right = targetCoordinates;
                        answer.append("R");
                    }
                    break;
            }
        }
        return answer.toString();
    }

    private int[] calculateCoordinates(int numPad) {
        switch (numPad) {
            case 1 -> {
                return new int[]{1, 4};
            }
            case 2 -> {
                return new int[]{2, 4};
            }
            case 3 -> {
                return new int[]{3, 4};
            }
            case 4 -> {
                return new int[]{1, 3};
            }
            case 5 -> {
                return new int[]{2, 3};
            }
            case 6 -> {
                return new int[]{3, 3};
            }
            case 7 -> {
                return new int[]{1, 2};
            }
            case 8 -> {
                return new int[]{2, 2};
            }
            case 9 -> {
                return new int[]{3, 2};
            }
            case 0 -> {
                return new int[]{2, 1};
            }
        }
        return new int[0];
    }
}
