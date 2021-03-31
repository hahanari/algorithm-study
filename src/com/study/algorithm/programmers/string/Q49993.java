package com.algorithm.string;

import java.util.ArrayList;
import java.util.List;

public class Q49993 {

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        List<String> skillPriority = new ArrayList<String>();
        skillPriority = convertStringListFrom(skill);

        for (String skillTree: skill_trees) {
            List<Integer> skillIndex = new ArrayList<>();
            List<String> skillTreeList = convertStringListFrom(skillTree);
            for (String str: skillTreeList) {
                if (skillPriority.contains(str)) {
                    skillIndex.add(skillPriority.indexOf(str));
                }
            }
            if (skillIndex.size() > 0) {
                if (checkPriority(skillIndex)) {
                    answer++;
                }
            } else {
                answer++;
            }
        }
        return answer;
    }

    private boolean checkPriority(List<Integer> priorityList) {
        for (int i = 0; i < priorityList.size(); i++) {
            if (priorityList.get(i) != i) {
                return false;
            }
        }
        return true;
    }

    private List<String> convertStringListFrom(String str) {
        List<String> convertList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            convertList.add(Character.toString(str.charAt(i)));
        }
        return convertList;
    }
}
