/* https://www.naukri.com/code360/problems/longest-subarray-with-zero-sum_6783450 */
import java.util.HashMap;

public class LargestSubarray {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        int cnt =0 ;
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            // System.out.println("===== "+arr[i]);
            if(sum == 0){
                cnt = i+1;
                // System.out.println("* "+cnt);
            }
            if(arr[i] == 0){
                cnt = cnt<1 ? 1 : cnt;
                // System.out.println("** "+cnt);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
                // System.out.println("*** "+cnt);
            }
            else{
                // System.out.println("***** "+cnt);
                int s = map.get(sum);
                s = i-s;
                cnt = cnt<s ? s : cnt;
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        int len = getLongestZeroSumSubarrayLength(new int[]{1,-1, 3,2,-2,-8,1,7,10,23});
        System.out.println(len);
        len = getLongestZeroSumSubarrayLength(new int[]{0,1,1,1});
        System.out.println(len);
        System.out.println("=============");
        len = getLongestZeroSumSubarrayLength(new int[]{-1,1,0,0,2});
        System.out.println(len);
    }
}
