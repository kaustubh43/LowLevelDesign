package DataStructuresAlgorithms.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayWithContiguousSum {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B)
    {
        int N = A.size();
        int i = 0, j = 0;
        int sum = 0;

        while(j < N)
        {
            sum += A.get(j);
            while(sum > B && i <= j)
            {
                sum -= A.get(i);
                i++;
            }
            if(sum == B)
                return new ArrayList<>(A.subList(i, j+1));

            j++;
        }

        return new ArrayList<>(Arrays.asList(-1));

    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int B = 9;
        System.out.println(solve(A, B));
    }
}
