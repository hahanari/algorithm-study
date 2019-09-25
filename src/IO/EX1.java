package IO;

import java.util.ArrayList;
public class EX1 {

    public int[] solution(int[][] v) {

        int[] answer = {};

        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();

        for(int[] list : v) {

            if(x.contains(list[0])) {
                x.remove(list[0]);
            } else {
                x.add(list[0]);
            }
            if(x.contains(list[1])) {
                y.remove(list[1]);
            } else {
                y.add(list[1]);
            }
        }

        answer[0] = x.get(0);
        answer[1] = y.get(0);

        return answer;
    }

}
