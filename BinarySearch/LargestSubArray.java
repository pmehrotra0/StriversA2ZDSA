/* https://www.naukri.com/code360/problems/largest-subarray-sum-minimized_7461751 */
public class LargestSubArray {
    public static int getPossArray(int []a, int size){
        int n=a.length;
        int cnt = 0;
        int aCnt = 1;
        for(int i=0;i<n;i++){
            System.out.println("--"+size+" "+cnt+" "+aCnt+" "+i +" "+a[i]);
            if((cnt + a[i]) <= size){
                cnt += a[i];
            }
            else{
                aCnt++;
                cnt = a[i];
            }
        }
        System.out.println("--"+size+" "+cnt+" "+aCnt+" ");

        return aCnt;
    }
    public static int largestSubarraySumMinimized(int []a, int k) {
        int max = Integer.MIN_VALUE, sum=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            max = max < a[i] ? a[i] : max;
            sum += a[i];
        }
        System.out.println(max+" "+sum);
        if(n<=k) return max;
        int low=max, high=sum;
        int ans= Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            int noOfPossArray = getPossArray(a, mid);
            System.out.println(mid+" "+noOfPossArray);
            if(noOfPossArray <= k) {
                ans  = ans > mid ? mid : ans;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(largestSubarraySumMinimized(new int[]{1, 2, 3, 4, 5}, 3));
        // System.out.println(largestSubarraySumMinimized(new int[]{3,5,1}, 3));
        // System.out.println(largestSubarraySumMinimized(new int[]{10, 4, 5, 10, 9, 10 }, 4));
    }
}
