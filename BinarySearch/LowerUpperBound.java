/*https://www.naukri.com/code360/problems/implement-upper-bound_8165383 */
/*https://www.naukri.com/code360/problems/lower-bound_8165382 */
/* https://www.naukri.com/code360/problems/algorithm-to-find-best-insert-position-in-sorted-array_839813 */
/*https://www.naukri.com/code360/problems/ceiling-in-a-sorted-array_1825401 */
public class LowerUpperBound {
    public static int lowerBound(int []arr, int n, int x) {
        int ans = n;
        int low=0, high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            System.out.println("here" + ans +" " + mid);
            if(arr[mid] >= x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println("here");
        return ans;
    }
    public static int upperBound(int []arr, int n, int x) {
        int ans = n;
        int low=0, high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            System.out.println("here" + ans +" " + mid);
            if(arr[mid] <= x){
                low = mid+1;
            }
            else{
                ans = mid;
                high = mid-1;
            }
        }
        System.out.println("here");
        return ans;
    }
    public static int searchInsert(int [] arr, int x){
        // Write your code here.
        int n = arr.length;
        int ans = n;
        int low=0, high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] < x){
                low = mid+1;
            }
            else{
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
    public static int[] getFloorAndCeil(int[] arr, int n, int x) {
        int lower = n-1, upper=n-1;
        int low=0, high=n-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid] == x){
                lower = mid; upper=mid;
                break;
            }
            else if(arr[mid] > x){
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
        System.out.println(lowerBound(new int[]{2,3,6,7,8,8,11,11,11,12}, 10, 11));
        System.out.println(upperBound(new int[]{2,3,6,7,8,8,11,11,11,12}, 10, 11));
        System.out.println(searchInsert(new int[]{2,3,6,7,8,8,11,11,11,12}, 11));
    }
}
