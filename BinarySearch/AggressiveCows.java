/* https://www.naukri.com/code360/problems/aggressive-cows_1082559 */
import java.util.*;

public class  AggressiveCows {

    public static boolean checkPossible(int stalls[], int k, int dist){
        // boolean flag = true;
        int i=1;
        k--;
        int n=stalls.length;
        int last=0;
        while(i<n){
            // System.out.println("last placed"+ last +" " +i+ "  "+k);
            if((stalls[i] - stalls[last]) >= dist){
                k--;
                last=i;
                i++;
            }
            else{
                i++;
            }
        }
        // System.out.println("k"+k);
        if(k<=0){
            return true;
        }
        return false;
    }

    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int min = Integer.MAX_VALUE;
        int max= stalls[n-1] - stalls[0];
        for(int i=0;i<n-1;i++){
            int dist = stalls[i+1] - stalls[i];
            min = min > dist ? dist : min;
        }
        // System.out.println(min +" "+max);
        int low=min, high=max;
        int res = Integer.MIN_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            boolean isPossible = checkPossible(stalls, k, mid);
            if(isPossible){
                res = res < mid ? mid : res;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        // for(int i=low; i<= high; i++){
        //     boolean isPossible = checkPossible(stalls, k, i);
        //     if(isPossible){
        //         res = res < i ? i : res;
        //     }
        //     // System.out.println("dist" + i + " " +isPossible);
        // }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(aggressiveCows(new int[]{0,3,4,7,9,10}, 4));
        System.out.println(aggressiveCows(new int[]{1,2,3}, 2));
        System.out.println(aggressiveCows(new int[]{1,2,3}, 2));
    }
}
