package main.java;

import java.util.ArrayList;

public class tt {
    public static void main(String[] args) {
        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(4);
        firstList.add(5);
        firstList.add(2);
        firstList.add(3);
        firstList.add(3);
        firstList.add(2);
        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(4);
        secondList.add(5);
        secondList.add(11);
        secondList.add(7);

        ArrayList<Integer> finalList = new ArrayList<>();
        for (int i = 0; i < firstList.size(); i++) {
            for (int j = 0; j < secondList.size(); j++) {
                if (firstList.get(i) == secondList.get(j)) {
                    finalList.add(firstList.get(i));
                }
            }
        }

        System.out.println(finalList);
    }
}
