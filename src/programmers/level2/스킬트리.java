package programmers.level2;

import javax.naming.AuthenticationNotSupportedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Stack;

public class 스킬트리 {
    public static boolean isSkillTree(String skill, String skill_tree) {
        for (int i = 0; i < skill_tree.length(); i++) {
            char c = skill_tree.charAt(i);
            if (!skill.contains(String.valueOf(c))) {
                skill_tree = skill_tree.replace(String.valueOf(c), "");
                i -=1;
            }
        }
        System.out.println(skill_tree+ "   " + skill );
        for (int j = 0; j < skill_tree.length(); j++) {
            if(skill.charAt(j) != skill_tree.charAt(j))
                return false;
        }
        return true;
    }
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i = 0; i<skill_trees.length; i++) {
            if(isSkillTree(skill, skill_trees[i]))
                answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] skill_trees = new String[]{"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution("CBD",skill_trees));
    }
}
