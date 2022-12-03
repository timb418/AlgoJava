package org.tim;

import org.tim.algorithms.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(BinarySearch.binarySearch(new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)), 3));

    }
}