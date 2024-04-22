/* https://www.naukri.com/code360/problems/allocate-books_1090540 */
import java.util.*;

public class AllocateBooks {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if(n<m) return -1;
        int min = Integer.MIN_VALUE;
        int sum = 0;
        int ans = Integer.MAX_VALUE;;
        for(int i=0;i<n;i++){
            min = min < arr.get(i) ? arr.get(i) : min;
            sum += arr.get(i);
        }
        // System.out.println(min + " " + sum);
        int low = min, high=sum;
        while(low<=high){
            int cnt=0;
            int stud = 1;
            int mid = (low+high)/2;
            for(int j=0;j<n;j++){
                // System.out.println(cnt + " " + stud + " " + j);
                if(cnt+arr.get(j) > mid){
                    cnt = arr.get(j);
                    stud++;
                }
                else{
                    cnt += arr.get(j);
                }
            } 
            // System.out.println(mid + " "+ stud );           
            // if(m == stud) return mid;
            if(stud<=m){
                high=mid-1;
                ans = mid<ans ? mid : ans;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(new Integer[]{12, 34, 67, 90}));
        System.out.println(findPages(al, 4, 2));
        al = new ArrayList<Integer>(Arrays.asList(new Integer[]{25, 46, 28, 49, 24}));
        System.out.println(findPages(al, 5, 4));
    }
}
