/*https://www.naukri.com/code360/problems/row-of-a-matrix-with-maximum-ones_982768 */
import java.util.*;

public class MaxOnes {
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> arr, int n, int m)
    {
        //	  Write your code here.
        int max=-1;
        int ind=-1;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<m;j++){
                if(arr.get(i).get(j) == 1){
                    cnt++;
                }
            }
            if(cnt>max && cnt!=0){
                max=cnt;
                ind=i;
            }
        }
        return ind;
    }
    public static int maximumOnesRowOPT(ArrayList<ArrayList<Integer>> arr, int n, int m)
    {
        //	  Write your code here.
        int max=-1;
        int ind=-1;
        for(int i=0;i<n;i++){
            int low=0, high=m-1;
            while(low<=high){
                int mid = (low+high)/2;
                if( arr.get(i).get(mid) == 0){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
            int len=m-high-1;
            System.out.println(low+" "+high+" "+len);
            if(len > max && len!=0){
                max=len;
                ind=i;
            }
            
        }
        return ind;
    }
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> zrr = new ArrayList<ArrayList<Integer>>();
        zrr.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        zrr.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        zrr.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        System.out.println(maximumOnesRowOPT(zrr, zrr.size(), zrr.get(0).size()));
        
    }
}
