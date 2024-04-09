
/* https://www.naukri.com/code360/problems/merge-all-overlapping-intervals_6783452 */
import java.util.*;

public class MergeIntervals {
    public static List< List< Integer >> mergeOverlappingIntervals(int [][]arr){
        // Write your code here.
        List< List< Integer >> res = new ArrayList<>();
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] != b[0] ? a[0] - b[0] : a[1] - b[1];
            }
        });
        int n = arr.length;
        Integer curr[] = new Integer[]{arr[0][0],arr[0][1]};
        // System.out.println(a÷rr);
        for(int i=0;i<n;i++)
        System.out.println(java.util.Arrays.toString(arr[i]));
        System.out.println("*****");

        for(int i=1;i<n;i++){
            if((arr[i][0] >= curr[0] && arr[i][0] <= curr[1]) || (arr[i][1] >= curr[0] && arr[i][1] <= curr[1])){
                curr[0] = curr[0] > arr[i][0] ? arr[i][0] : curr[0];
                curr[1] = curr[1] < arr[i][1] ? arr[i][1] : curr[1];
            }
            else{
                List<Integer> al = new ArrayList<Integer>(Arrays.asList(curr));
                res.add(al);
                System.out.println(java.util.Arrays.toString(curr));
                curr[0] = arr[i][0];
                curr[1] = arr[i][1];
            }
        }
        List<Integer> al = new ArrayList<Integer>(Arrays.asList(curr));
        res.add(al);

        return res;
    }
    public static void main(String[] args) {
        List<List< Integer >> ans = mergeOverlappingIntervals(new int[][]{{1, 3}, {3, 5}, {6, 7},{2,5}, {2, 4}});
        System.out.println(ans);
    }
}
