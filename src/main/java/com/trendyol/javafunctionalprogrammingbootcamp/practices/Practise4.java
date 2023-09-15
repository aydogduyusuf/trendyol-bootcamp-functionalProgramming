package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Practise4 {
    public static class StringComparator implements Comparator<String> {
        private final boolean decreasing;

        public StringComparator(boolean decreasing) {
            this.decreasing = decreasing;
        }

        @Override
        public int compare(String s1, String s2) {
            int l1 = s1.length();
            int l2 = s2.length();

            if (l1 < l2) {
                return this.decreasing? 1 : -1;
            } else if (l1 > l2) {
                return this.decreasing? -1 : 1;
            } else {
                return 0;
            }
        }

    }
    public List<String> orderByLength(List<String> strings, boolean decreasing) {
        // TODO: implement method that accepts list of strings and a boolean which indicates order way
        // TODO: returns them ordering by their length.

        return strings.stream().
                sorted(new StringComparator(decreasing)).
                toList();
    }
}
