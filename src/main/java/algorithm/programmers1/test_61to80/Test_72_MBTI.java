package algorithm.programmers1.test_61to80;

public class Test_72_MBTI {
    public String solution(String[] survey, int[] choices) {
        // RT, CF, JM, AN
        // 1,2,3, 4, 5,6,7
        String answer = "";
        int rPoint = 100;
        int tPoint = 100;
        int cPoint = 100;
        int fPoint = 100;
        int jPoint = 100;
        int mPoint = 100;
        int aPoint = 100;
        int nPoint = 100;

        for (int i = 0; i < survey.length; i++) {
            char alphabet = survey[i].charAt(1);
            switch (alphabet) {
                case 'T' -> tPoint += choices[i] - 4;
                case 'R' -> rPoint += choices[i] - 4;
                case 'F' -> fPoint += choices[i] - 4;
                case 'C' -> cPoint += choices[i] - 4;
                case 'J' -> jPoint += choices[i] - 4;
                case 'M' -> mPoint += choices[i] - 4;
                case 'A' -> aPoint += choices[i] - 4;
                case 'N' -> nPoint += choices[i] - 4;
            }
        }

        if (tPoint > rPoint) {
            answer += "T";
        } else {
            answer += "R";
        }

        if (fPoint > cPoint) {
            answer += "F";
        } else {
            answer += "C";
        }

        if (mPoint > jPoint) {
            answer += "M";
        } else {
            answer += "J";
        }

        if (nPoint > aPoint) {
            answer += "N";
        } else {
            answer += "A";
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_72_MBTI sol = new Test_72_MBTI();
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(sol.solution(survey, choices));
    }
}
