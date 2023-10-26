package algorithm.programmers0.Test_61to70;

public class Test_66_LoginSuccessful {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                if (id_pw[1].equals(db[i][1])) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                    break;
                }
            } else {
                answer = "fail";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_66_LoginSuccessful sol = new Test_66_LoginSuccessful();
//        String[] id_pw = {"meosseugi", "1234"}; // login
//        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
//        String[] id_pw = {"programmer01", "15789"}; // wrong pw
//        String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
        String[] id_pw = {"rabbit04", "98761"}; // fail
        String[][] db = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
        System.out.println(sol.solution(id_pw, db
        ));
    }
}
