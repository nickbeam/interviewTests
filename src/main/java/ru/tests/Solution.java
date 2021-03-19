package ru.tests;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(mergeSortedLists(List.of(2, 4, 6), List.of(1, 3, 5)));
    }

    private static List<Integer> mergeSortedLists(List<Integer> listA, List<Integer> listB) {
        //return Stream.concat(listA.stream(), listB.stream()).sorted().collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < listA.size() && j < listB.size()) {
            if (listA.get(i) < listB.get(j)) {
                resultList.add(listA.get(i++));
            } else {
                resultList.add(listB.get(j++));
            }
        }
        if (i < listA.size()) {
            resultList.add(listA.get(listA.size() - 1));
        } else if (j < listB.size()) {
            resultList.add(listB.get(listB.size() - 1));
        }
        return resultList;
    }
}
