package Practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class MergeIntervals {
    public static ArrayList<Interval> insert(ArrayList<Interval> A, Interval newInterval) {
        int start, end;
        if(newInterval.start < newInterval.end){
            start = newInterval.start;
            end = newInterval.end;
        }
        else{
            start = newInterval.end;
            end = newInterval.start;
        }

        ArrayList<Interval> result = new ArrayList<>();

        int i = 0, N = A.size();
        boolean inserted = false;

        while(i < N){      // Check
            int currS = A.get(i).start;
            int currE = A.get(i).end;
            // Before and inserted: keep adding
            if(end <  currS || start > currE || inserted){
                result.add(A.get(i));
            }
            // Merge
            else if(start < currE){
                start = Math.min(start, currS);
                end = Math.max(end, currE);
            }
            // is higher, add current.
            else{
                result.add(new Interval(start, end));
            }
            i++;
        }

        if(!inserted){
            Interval last = new Interval(start, end);
            result.add(last);
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Interval> A = new ArrayList<>();
        A.add(new Interval(1, 2));
        A.add(new Interval(3, 6));

        Interval B = new Interval(10, 8);

        ArrayList<Interval> C = insert(A, B);
    }
}



