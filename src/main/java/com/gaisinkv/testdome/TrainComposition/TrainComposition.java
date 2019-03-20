package com.gaisinkv.testdome.TrainComposition;

import java.util.Deque;
import java.util.LinkedList;

//10min + time spent on searching for the right data structure, which was around 30min
public class TrainComposition {

    private final Deque<Integer> wagons = new LinkedList<>();

    public void attachWagonFromLeft(int wagonId) {
        wagons.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
        wagons.addLast(wagonId);
    }

    public int detachWagonFromLeft() {
        return wagons.pollFirst();
    }

    public int detachWagonFromRight() {
        return wagons.pollLast();
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        System.out.println(tree.detachWagonFromRight()); // 7
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}
