package algorithm.programmers0.test_121to140;

public class Test_121_SeparatedBySpaces2 {
    public String[] solution(String my_string) {
        my_string = my_string.trim().replaceAll("\\s+", " ");
        return my_string.split(" ");
    }
}
