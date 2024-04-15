/* https://www.naukri.com/code360/problems/search-in-rotated-sorted-array_1082554 */
import java.util.*;

public class RotatedSearch {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int ans =-1;
        //first half
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid) == k) return mid;
            if(arr.get(low) <= arr.get(mid) && (arr.get(low) <= k && k<arr.get(mid))){
                high = mid-1;
                continue;
            }            
            else if(arr.get(mid)<=arr.get(high) && (arr.get(mid) < k && k<=arr.get(high))){
                low = mid+1;
                continue;
            }
            else if(arr.get(low) > arr.get(mid)){
                high = mid-1;
                continue;
            }
            else{
                low = mid+1;
                continue;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> zrr=  new ArrayList<>(Arrays.asList(7,8,9,1,2,3,4,5,6));
        int res=search(zrr, zrr.size(), 6);
        System.out.println(res);
        zrr=  new ArrayList<>(Arrays.asList(2, 3, 5, 8));
        res=search(zrr, zrr.size(), 3);
        System.out.println(res);
    }
}
