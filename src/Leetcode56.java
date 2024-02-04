import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Leetcode56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });

        List<int[]> ansList = new ArrayList<int[]>();
        int start = intervals[0][0],
                end = intervals[0][1];
        for(int i = 0; i < intervals.length; i++){
            if(intervals[i][0] == start){
                end = Math.max(end, intervals[i][1]);
            }else{
                if(intervals[i][0] <= end){
                    end = Math.max(end, intervals[i][1]);
                }else{
                    ansList.add(new int[]{start, end});
                    start = intervals[i][0];
                    end = intervals[i][1];
                }
            }
        }
        ansList.add(new int[]{start, end});

        return ansList.toArray(new int[ansList.size()][]);
    }
}
