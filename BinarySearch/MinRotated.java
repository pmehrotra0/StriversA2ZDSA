/* https://www.naukri.com/code360/problems/rotated-array_1093219 */
/* https://www.naukri.com/code360/problems/rotation_7449070 */
public class MinRotated {
    public static int findKRotation(int []arr){
        // Write your code here.
        int min = Integer.MAX_VALUE;
        int minind = -1;
        int low = 0, high= arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(min > arr[mid]){
                min = arr[mid];
                minind = mid;
            }
            if(arr[mid] < arr[high]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return minind;
    }
    public static int findMin(int []arr) {
        // Write your code here.
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        int low=0, high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            min = min < arr[mid] ? min : arr[mid];
            if(arr[mid] < arr[high]){
                high = mid-1;
            }
            else{
                min = min < arr[low] ? min : arr[low];
                low = mid+1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int res=findMin(new int[]{7,8,9,1,2,3,4,5,6});
        System.out.println(res);
        System.out.println(findKRotation(new int[]{7,8,9,1,2,3,4,5,6}));
    }
}
