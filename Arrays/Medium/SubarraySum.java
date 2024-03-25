
/* https://www.codingninjas.com/studio/problems/subarray-sums-i_1467103 */
import java.util.HashMap;

public class SubarraySum {
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
       
        int cnt = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum == k)
                cnt++;
            }
        }

        return cnt;   
    }

    public static int findAllSubarraysWithGivenSumOpt(int arr[], int k) {
       
        int cnt = 0;
        int preSum = 0;
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i=0;i<n;i++){
            preSum += arr[i];
            int remove =  preSum - k;
            cnt += map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }

        return cnt;   
    }

    public static void main(String[] args) {
        int res =  findAllSubarraysWithGivenSum(new int[]{1,2,3,-3,1,1,1,4,2,-3}, 3);
        System.out.println(res);
    }
}
