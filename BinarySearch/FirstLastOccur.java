/* https://www.naukri.com/code360/problems/first-and-last-position-of-an-element-in-sorted-array_1082549 */
import java.util.*;

public class FirstLastOccur {
    public static int locate(ArrayList<Integer> arr, int n, int k){
        int low=0, high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid) == k){
                return mid;
            }
            else if(arr.get(mid) > k){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int loc = locate(arr, n, k);
        if(loc == -1){
            return new int[]{-1, -1};
        }
        else{
            int low = loc, high = loc;
            while(low>=0 && arr.get(low) == k){
                low--;
            }
            while(high<=n-1 && arr.get(high) == k){
                high++;
            }
            return new int[]{low+1, high-1};
        }
    }

    public static int[] firstAndLastPositionOpt(ArrayList<Integer> arr, int n, int x){//solve with lower&upper bound logic
        int lower=-1, upper=-1;
        int low=0, high=n-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr.get(mid) == x){
                lower = mid; upper=mid;
                break;
            }
            else if(arr.get(mid) > x){
                upper = mid;
                high = mid-1;
            }
            else{
                lower = mid;
                low = mid+1;
            }
        }
        return new int[]{lower, upper};
    }
    public static void main(String[] args) {
        ArrayList<Integer> zrr=  new ArrayList<>(Arrays.asList(0, 0, 1, 1, 2, 2, 2, 2));
        int res[]=firstAndLastPosition(zrr, zrr.size(), 2);
        System.out.println(Arrays.toString(res));
        res=firstAndLastPositionOpt(zrr, zrr.size(), 2);
        System.out.println(Arrays.toString(res));
    }
}
