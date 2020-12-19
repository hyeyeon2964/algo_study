package programmers.level2;

import javax.naming.AuthenticationNotSupportedException;
import java.util.Arrays;
import java.util.Stack;

public class 스킬트리 {
    public static boolean treeIsTrue(String skill, String skillTree)
    {
        for(int i = 0; i< skillTree.length(); i++)
        {
            String s= String.valueOf(skillTree.charAt(i));
            if(!skill.contains(s))
            {
                skill = skill.replaceAll(s, "");
            }
        }

        for(int i =0; i<skillTree.length(); i ++)
        {
            if (skill.indexOf(skillTree) == 0)
            {
                return true;
            }
        }
        return false;
    }


    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {
            if (true == treeIsTrue(skill, skill_trees[i])) {
                answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String[] skill_trees = new String[]{"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution("CBD",skill_trees));
    }
}
