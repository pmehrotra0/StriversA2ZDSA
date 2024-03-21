/* https://www.codingninjas.com/studio/problems/longest-successive-elements_6811740 */
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class LongestConsSeq {

    public static int longestSuccessiveElementsOpt(int []a){
        int max = Integer.MIN_VALUE;
        int n = a.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        for(int it:set){
            if(!set.contains(it-1)){
                int cnt = 0;
                int x = it;
                while(set.contains(it)){
                    it++;
                    cnt++;
                }
                max = max < cnt ? cnt : max;
            }
        }
        return max;
    }

    public static int longestSuccessiveElements(int []a) {
        int max = Integer.MIN_VALUE;
        int currcnt = 0;
        int lastMin = Integer.MIN_VALUE;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i] - 1 == lastMin){
                currcnt ++;
                lastMin = a[i];
            }
            else if(lastMin != a[i]){
                currcnt = 1;
                lastMin = a[i];
            }
            max = max<currcnt ? currcnt : max;
        }
        return max;
    }
    public static void main(String[] args) {
        int res = longestSuccessiveElementsOpt(new int[]{5, 8, 3, 2, 1, 4});
        System.out.println(res);
    }
}
