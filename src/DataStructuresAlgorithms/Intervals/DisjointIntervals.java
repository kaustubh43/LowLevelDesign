package DataStructuresAlgorithms.Intervals;

import lombok.AllArgsConstructor;

import java.util.Arrays;

public class DisjointIntervals {

    @AllArgsConstructor
    static
    class Pair {
        int start;
        int end;
    }

    int disjointIntervals(int[][] A) {
        Pair[] pairs = new Pair[A.length];

        for (int i = 0; i < A.length; i++) {
            pairs[i] = new Pair(A[i][0], A[i][1]);
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a.end, b.end));

        int count = 0;
        int preEnd = -1;
        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i].start > preEnd) {
                count++;
                preEnd = pairs[i].end;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        DisjointIntervals solver = new DisjointIntervals();

        int[][][] inputs = {
                {{1, 4}, {2, 3}, {4, 6}, {8, 9}},   // mixed overlaps
                {{1, 2}, {2, 10}, {4, 6}},          // shared endpoint
                {{1, 2}, {2, 3}, {3, 4}},           // chain of touching intervals
                {{1, 10}, {2, 3}, {4, 5}},          // nested intervals
                {{5, 5}},                           // single point interval
                {}                                  // empty input
        };
        int[] expected = {3, 2, 2, 2, 1, 0};

        for (int i = 0; i < inputs.length; i++) {
            int result = solver.disjointIntervals(inputs[i]);
            String status = result == expected[i] ? "PASS" : "FAIL";
            System.out.println(status + " -> " + Arrays.deepToString(inputs[i])
                    + " expected=" + expected[i] + " got=" + result);
        }
    }
}
