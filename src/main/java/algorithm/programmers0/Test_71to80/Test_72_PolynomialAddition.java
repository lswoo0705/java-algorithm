package algorithm.programmers0.Test_71to80;

public class Test_72_PolynomialAddition {
    public String solution(String polynomial) {
        String answer;
        int variable = 0;
        int constant = 0;

        String[] polyArray = polynomial.split("\\s*\\+\\s*");

        for (int i = 0; i < polyArray.length; i++) {
            if (polyArray[i].contains("x")) {
                if (polyArray[i].equals("x")) {
                    variable++;
                } else {
                    variable += Integer.parseInt(polyArray[i].replaceAll("x", ""));
                }
            } else {
                constant += Integer.parseInt(polyArray[i]);
            }
        }

        // 변수의 계수를 우선적으로 정한 뒤 정수 유무에 따라서 정함
        if (variable == 0) {                    // 변수의 계수가 0일 때
            answer = String.valueOf(constant);  // 정수만 반환
        } else if (variable == 1) {         // 변수의 계수가 1일 때
            answer = "x";                   // 변수의 계수를 생략
            if (constant != 0) {            // 근데 그와중에 정수가 0이 아니면
                answer += " + " + constant; // 변수에 계수 생략한거에 정수를 붙임
            }
        } else {                            // 그 외에는
            answer = variable + "x";        // 변수의 계수를 정하고
            if (constant != 0) {            // 정수가 0이 아니면
                answer += " + " + constant; // 변수 뒤에 정수를 더함
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_72_PolynomialAddition sol = new Test_72_PolynomialAddition();
//        String polynomial = "3x + 7 + x"; // "4x + 7"
//        String polynomial = "7 + x"; // "x + 7"
//        String polynomial = "x + x + x"; // "3x"
//        String polynomial = "3 + 6"; // "9"
        String polynomial = "x"; // "x"

        System.out.println(sol.solution(polynomial));
    }
}
