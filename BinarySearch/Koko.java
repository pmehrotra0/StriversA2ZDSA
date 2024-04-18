/* https://www.naukri.com/code360/problems/minimum-rate-to-eat-bananas_7449064 */
import java.util.*;

public class Koko {
    public static long calcRate(int []v, int r){
        int n = v.length;
        long sum = 0;
        for(int i=0;i<n;i++){
            sum += (v[i]/r) + (v[i]%r == 0 ? 0 : 1);
            System.out.println("incalc"+sum+" "+r+" "+v[i]);
        }
        return sum;
    }
    public static int minimumRateToEatBananas(int []v, int h) {
        // Arrays.sort(v);
        int n = v.length;
        if(n==1) return (int)calcRate(v, h);
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = max < v[i] ? v[i] : max;
        }
        
        int low = 1; int high = max;
        int ans = 1;
        while(low<=high){
            int rate = (low+high)/2;
            long calcR = calcRate(v, rate);
            System.out.println(low+ " " + high+ " " +rate + " "+ calcR);
            if(calcR <= h){
                ans = rate;
                high=rate-1;
            }
            else{
                low = rate+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        // System.out.println(minimumRateToEatBananas(new int[]{3, 6, 2, 8}, 7));
        // System.out.println("********");
        // System.out.println(minimumRateToEatBananas(new int[]{7, 15, 6, 3}, 8));
        // System.out.println("********");
        // System.out.println(minimumRateToEatBananas(new int[]{9}, 2));
        System.out.println("********");
        System.out.println(minimumRateToEatBananas(new int[]{805306368,805306368,805306368}, 1000000000));
    }
}
