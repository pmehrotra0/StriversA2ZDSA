/* https://www.naukri.com/code360/problems/find-peak-element_1081482 */
import java.util.*;

public class FindPeak {
    public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size();
        if(n==1) return 0;
        if(arr.get(0) > arr.get(1)) return 0;
        if(arr.get(n-1) > arr.get(n-2)) return n-1;
        int low=1, high=n-2;
        while(low<=high){
            int mid= (low+high)/2;
            System.out.println(mid);
            if(arr.get(mid)>arr.get(mid-1) && arr.get(mid)>arr.get(mid+1)){
                return mid;
            }
            else if(arr.get(mid+1) > arr.get(mid) && arr.get(mid) > arr.get(mid-1)){
                low=mid+1;
            }
            else{high=mid-1;}
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> zrr=  new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,5,1));
        int res=findPeakElement(zrr);
        System.out.println(res);
        System.out.println("*****");
        zrr=  new ArrayList<>(Arrays.asList(1,8,1,5,3));
        res=findPeakElement(zrr);
        System.out.println(res);
    }
}
