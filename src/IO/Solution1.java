package IO;

import java.util.ArrayList;
import java.util.Collections;

public class Solution1 {

    public long solution(int n) {

        long answer = 0;
        ArrayList<Long> list = new ArrayList<>();

        for (int i=1; i<1000; i++) {
            if (!list.contains((long) i * (i + 1)))
                list.add((long) i * (i + 1));
            if (!list.contains((long) i * (i + 1) * (i + 2)))
                list.add((long) i * (i + 1) * (i + 2));
            if (!list.contains((long) i * (i + 1) * (i + 2) * (i + 3)))
                list.add((long) i * (i + 1) * (i + 2) * (i + 3));
            if (!list.contains((long) i * (i + 1) * (i + 2) * (i + 4)))
                list.add((long) i * (i + 1) * (i + 2) * (i + 3)* (i + 4));
        }


        Collections.sort(list);

//        System.out.println(list.toString());

//        System.out.println(list.get(n-1));

        answer = list.get(n-1);

        return answer;
    }

    private static long fact(long n) {

        if (n <= 1)
            return n;
        else
            return fact(n-1) * n;
    }

}
