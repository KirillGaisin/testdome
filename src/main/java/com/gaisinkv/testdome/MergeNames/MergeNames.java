package com.gaisinkv.testdome.MergeNames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//17min
public class MergeNames {
    public static String[] uniqueNames(String[] names1, String[] names2) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, names1);
        Collections.addAll(names, names2);
        List<String> uniqueNames = new ArrayList<>();
        for (String name: names) {
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
            }
        }
        return uniqueNames.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
