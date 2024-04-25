/* https://www.naukri.com/code360/problems/painter-s-partition-problem_1089557 */
import java.util.*;

public class PainterPartition {
    public static int findNoOfPainter(ArrayList<Integer> a, int time){
        int n = a.size();
        int noOfPainter = 1;
        int cnt = 0;
        for(int i=0;i<n;i++){
            if((cnt+a.get(i)) <= time){
                cnt += a.get(i);
            }
            else{
                noOfPainter++;
                cnt = a.get(i);
            }
        }
        return noOfPainter;
    }
    public static int findLargestMinDistance(ArrayList<Integer> a, int k)
    {
            int n = a.size();
            int max=0, sum=0;
            for(int i=0;i<n;i++){
                max = max < a.get(i) ? a.get(i) : max;
                sum += a.get(i);
            }
            System.out.println(max + " " +sum);
            int low=max, high=sum;
            while(low<=high){
                int mid = (low+high)/2;
                int noOfPainter = findNoOfPainter(a, mid);
                System.out.println(mid +" "+noOfPainter);
                if(noOfPainter > k){
                    low = mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            System.out.println(low+" -- "+high);
            return low;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(new Integer[]{2, 1, 5, 6, 2, 3}));
        System.out.println(findLargestMinDistance(al, 2));
    }
}
