/* https://www.naukri.com/code360/problems/kth-missing-element_893215 */
public class KthMissingNumber {
    public static int missingK(int[] v, int n, int k) {
        if(v[0] > k) return k;
        int i =0;
        while(i<n && v[i] <= k){
            k++;
            i++;
        }
        return k;
    }
    public static int missingKOpt(int[] v, int n, int k) {
        if(v[0] > k) return k;
        int low=0, high=n-1;
        // for(int i=low; i<=high; i++){
        //     // int mid = (low+high)/2;
        //     int noOFMissing = v[i] - (i+1);
        //     System.out.println(i +" "+noOFMissing);
        //     low++;
        // }

        while(low<=high){
            int mid = (low+high)/2;
            int noOFMissing = v[mid] - (mid+1);
            if(noOFMissing >= k){
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(low+ " " +high);
        int missing = v[high] - (high+1);
        int ans = v[high] + (k-missing);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(missingKOpt(new int[]{2,4,5,7}, 4, 3));
        System.out.println(missingKOpt(new int[]{2,3,4,7,11}, 5, 5));
        System.out.println(missingKOpt(new int[]{1,2,3,4,5,6,7,8,9,10}, 10, 3));
        System.out.println(missingKOpt(new int[]{4, 7, 9, 10}, 4, 4));
    }
}
