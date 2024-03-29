/* https://www.naukri.com/code360/problems/4sum_5713771 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int []nums, int target) {
        List<List< Integer > > res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int low = j+1;
                int high = n-1;
                while(low<high){
                    int sum = nums[i] + nums[j] + nums[low] + nums[high];
                    if(sum == target){
                        List<Integer> tmp = Arrays.asList(nums[i], nums[j], nums[low], nums[high]);
                        low++;
                        high--;
                        if(!res.contains(tmp)){
                            System.out.println(sum );
                            res.add(tmp);
                        }
                    }
                    else if(sum < target){
                        low++;
                    }
                    else if(sum > target){
                        high--;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        List<List<Integer>> res = fourSum(new int[]{2,2,2,2,1,3}, 8);
        System.out.println(res);
        res = fourSum(new int[]{1, 2, 1, 0, 1}, 5);
        System.out.println(res);

    }
}
