/* https://www.naukri.com/code360/problems/search-in-rotated-sorted-array_1082554 */
/* https://www.naukri.com/code360/problems/search-in-a-rotated-sorted-array-ii_7449547 */
import java.util.*;

public class RotatedSearch {
    public static boolean searchInARotatedSortedArrayII(int []a, int key) {
        int low=0, high=a.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid] == key){
                return true;
            }
            if(a[mid] == a[low]){
                low++;
                continue;
            }
            if(a[mid] == a[high]){
                high--;
                continue;
            }
            if(a[low] < a[mid]){
                if(a[low] <= key && key<a[mid]){
                    high = mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(a[mid] < key && key<=a[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
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
        System.out.println(searchInARotatedSortedArrayII(new int[]{3,4,5,0,0,1,2}, 4));
        System.out.println(searchInARotatedSortedArrayII(new int[]{21, 26, 30, 30, 32, 33, 35, 36, 40, 43, 47, 49, 4, 5, 19 }, 50));
    }
}
