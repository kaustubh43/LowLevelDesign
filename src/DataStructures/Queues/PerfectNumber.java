package DataStructures.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumber {
    public static String solve(int A) {
        if (A == 1) return "11";
        if (A == 2) return "22";

        Queue<String> q = new LinkedList<>();
        q.add("1");
        q.add("2");
        int count = 2;
        String ans = "";
        while (true) {
            String num = q.poll();
            String first = num + "1";
            String second = num + "2";
            q.add(first);
            count++;
            if (count == A) {
                ans = first + new StringBuilder(first).reverse().toString();
                break;
            }
            q.add(second);
            count++;
            if (count == A) {
                ans = second + new StringBuilder(second).reverse().toString();
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        for(int i = 1; i < 50; i++) {
//            System.out.println(solve(i));
//        }
        System.out.println(solve(5));
    }
}