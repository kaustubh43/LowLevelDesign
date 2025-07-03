package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static String largestNumber(ArrayList<Integer> A)
    {
        Collections.sort(A, new Comparator<Integer>(){
            public int compare(Integer V1, Integer V2)
            {
                String XY = String.valueOf(V1) + String.valueOf(V2);
                String YX = String.valueOf(V2) + String.valueOf(V1);

                return XY.compareTo(YX) > 0 ? 1 : -1;
            }
        });

        String result = "";
        for(int i: A)
        {
            String temp = String.valueOf(i);
            result = temp + result;
        }

        // if (A.get(0) == 0) return "0"; // Covering edge case wherein the input is 0.
        return result;
    }

    public static void main(String[] args) {
        String A = largestNumber(new ArrayList<>(List.of(9, 35, 0 , 3)));
        System.out.println(A);
    }
}
