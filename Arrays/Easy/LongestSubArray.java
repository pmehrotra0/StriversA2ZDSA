/*https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_5713505 */
/* https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399 */
import java.util.HashMap;

public class LongestSubArray {
   public static int longestSubarrayWithSumK(int []a, long k) { //TC: O(n^2)
        int max = 0;
        int n = a.length;
        for(int i=0;i<n;i++){
            long sum=0;
            int j = i;
            while(j<n){
                sum = sum+a[j];
                System.out.println(i+ " "+ j + " "+sum);
                if(sum>k){
                    sum=0;
                    break;
                }
                else if(sum == k){
                    if(max<(j-i+1)){
                       
                        max = j-i+1;
                    }
                }
                j++;
            }

        }
        return max;
    }
    
    public static int longestSubarrayWithSumK1(int a[], long k){ //TC: O(n^2)
        int n = a.length;
        long sum;
        int max = 0;
        for(int i=0;i<n;i++){
            sum = 0;
            for(int j=i;j<n;j++){
                sum = sum + a[j];
                if(sum == k){
                    if(max < (j-i + 1)){
                        max = j-i+1;
                    }
                }
                else if(sum > k){
                    break;
                }
            }
        }
        return max;
    }
    
    public static int longest(int a[], long k){
        HashMap<Long, Integer> map = new HashMap<>();
        int max=0;
        long sum=0;
        for(int i=0;i<a.length;i++){
            sum +=a[i];
            if(!map.containsKey(sum))
            map.put(sum, i);
            if(sum == k){
                if(max < i){
                    max = i+1;
                }
            }
            if(map.containsKey(sum - k)){
                int len = i - map.get(sum-k);
                if(len > max){
                    max = len;
                }
            }
            // System.out.println(map +" "+i);
        }
        return max;
    }
    
    public static int longestOpt(int a[], long k){//1,2,3,1,1,1,1 //5
        int left=0, right=0;
        int n = a.length;
        long sum = a[0];
        int max = 0;
        while(right<n ){
            while(left <= right && sum>k){
                sum -= a[left];
                left++;
            }
            if(sum == k){
                max = max < (right-left+1) ? (right - left + 1) : max;
            }
            right++;
            if(right < n){
                sum +=a[right];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // int res = longestSubarrayWithSumK1(new int[]{1,2,3,0,0,1,1,1,1}, 5);
        // System.out.println(res);
        // res = longestSubarrayWithSumK1(new int[]{8, 15, 17, 0, 11 }, 17);
        // System.out.println(res);
        // res = longestSubarrayWithSumK1(new int[]{8, 15, 17, 0, 11 }, 1);
        // System.out.println(res);

        int res = longest(new int[]{1,2,3,0,0,1,1,1,1}, 5);
        System.out.println(res);
        res = longest(new int[]{8, 15, 17, 0, 11 }, 17);
        System.out.println(res);
        res = longest(new int[]{2,0,0,3 }, 3);
        System.out.println(res);
        res = longest(new int[]{2,3,5 }, 5);
        System.out.println(res);
        System.out.println("******");
        res = longestOpt(new int[]{1,2,3,1,1,1,1}, 5);
        System.out.println(res);
        res = longestOpt(new int[]{8, 15, 17, 11 }, 17);
        System.out.println(res);
        res = longestOpt(new int[]{2,1,1,1,3 }, 3);
        System.out.println(res);
        res = longestOpt(new int[]{2,3,5 }, 5);
        System.out.println(res);
    }
}