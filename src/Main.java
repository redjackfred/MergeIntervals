import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Leetcode56 leetcode56 = new Leetcode56();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] newIntervals = leetcode56.merge(intervals);
        for(int i = 0; i < newIntervals.length; i++) {
            System.out.println(Arrays.toString(newIntervals[i]));
        }
    }
}