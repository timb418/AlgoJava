package org.tim.algorithms;

import java.util.List;

public class BinarySearch {
    public static int binarySearch(List<Integer> numbers, int target) {
        int low = 0;
        int high = numbers.size() - 1;

        while (low <= high) {
            // why use >>> 1? by using the unsigned shift, it avoids overflows which result in a negative number
            // >>> 1 is kinda equal to / 2, but without overflow issues when adding low to high
            int middle = (low + high) >>> 1;
            int middleValue = numbers.get(middle);

            if (middleValue < target) {
                low = middle + 1;
            } else if (middleValue > target) {
                high = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
