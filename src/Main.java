import IO.EX1;
import IO.Solution;
import IO.Solution1;
import dp.BJ11726;
import dp.BJ1463;
import dp.BJ2579;
import dp.BJ9095;

public class Main {

    public static void main(String[] args) {

        BJ1463 bj1463 = new BJ1463();
//        System.out.println(bj1463.solution());

        BJ9095 bj9095 = new BJ9095();
//        bj9095.solution();

        BJ2579 bj2579 = new BJ2579();
//        bj2579.solution();

        EX1 ex1 = new EX1();
        int[][] list = {{1,1}, {2,2}, {1,2}};
//        ex1.solution(list);

        Solution solution = new Solution();
        String[] record = {"RECEIVE abcd@naver.com", "RECEIVE zzkn@naver.com", "DELETE", "RECEIVE qwerty@naver.com", "SAVE", "RECEIVE QwerTY@naver.com"};
//        solution.solution(record);

        Solution1 solution1 = new Solution1();
//        solution1.solution(9);

        BJ11726 bj11726 = new BJ11726();
        bj11726.solution();
    }
}
