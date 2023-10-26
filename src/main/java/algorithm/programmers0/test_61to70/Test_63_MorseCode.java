package algorithm.programmers0.test_61to70;

public class Test_63_MorseCode {
    public String solution(String letter) {
        String answer = "";
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."};
        String[] arrLetter = letter.split(" ");

        for (String msg : arrLetter) {
            for (int i = 0; i < morseCode.length; i++) {
                if (msg.equals(morseCode[i])) {
                    answer += Character.toString(i + 'a');
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_63_MorseCode sol = new Test_63_MorseCode();
//        String letter = ".... . .-.. .-.. ---";
        String letter = ".--. -.-- - .... --- -.";
        System.out.println(sol.solution(letter));
    }
}
