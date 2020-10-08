package programmers.level2;

import java.util.Arrays;

public class 스킬트리 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int skillListIndex = 0;
        int beforeIndex = 0;

        for(int i = 0; i<skill_trees.length; i++){
            for(int j = 0; j<skill_trees[i].length(); j++){
                if(skillListIndex == skill.length()){
                    answer++;
                    System.out.println(skill_trees[i]);
                    skillListIndex = 0;
                    break;
                }
                if(skill_trees[i].charAt(j) == skill.charAt(skillListIndex)){
                    beforeIndex = j;
                    //System.out.println(skill_trees[i].charAt(j));
                    skillListIndex++;
                }
                else{

                    if(skill_trees[i].indexOf(skill_trees[i].charAt(j)) < skill_trees[i].indexOf(skill_trees[i].charAt(beforeIndex)))
                        break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] skill_trees = new String[]{"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution("CBD",skill_trees));
    }
}
