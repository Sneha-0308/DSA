package com.leetCode;

import java.util.List;

public class Count_Items_Matching_a_Rule {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0, k;
        if (ruleKey.equals("color")) {
            k = 1;
        } else if (ruleKey.equals("name")) {
            k = 2;
        } else
            k = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(k).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
