/*https://www.naukri.com/code360/problems/implement-upper-bound_8165383 */
/*https://www.naukri.com/code360/problems/lower-bound_8165382 */
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
    public static void main(String[] args) {
        System.out.println(upperBound(new int[]{2,3,6,7,8,8,11,11,11,12}, 10, 11));
    }
}
