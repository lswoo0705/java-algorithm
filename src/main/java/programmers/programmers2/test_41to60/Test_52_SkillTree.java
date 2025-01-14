package programmers.programmers2.test_41to60;

public class Test_52_SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String skillTree : skill_trees) {
            StringBuilder filteredSkill = new StringBuilder();

            // 스킬트리에서 선행 스킬만
            for (char c : skillTree.toCharArray()) {
                if (skill.indexOf(c) != -1) {
                    filteredSkill.append(c);
                }
            }

            // 선행 스킬 순서와 비교
            if (skill.startsWith(filteredSkill.toString())) {
                answer++;
            }
        }

        return answer;
    }
}
