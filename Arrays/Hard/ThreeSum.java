/* https://www.naukri.com/code360/problems/three-sum_6922132 */
import java.util.*;

public class ThreeSum {

    public static List< List < Integer > > triplet(int n, int []arr) {
        List<List< Integer > > res = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (i != 0 && arr[i] == arr[i - 1]) continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    res.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        List<List< Integer > > res = triplet(5, new int[]{-1,-1,2,0,1});
        System.out.println(res);
    }
}
