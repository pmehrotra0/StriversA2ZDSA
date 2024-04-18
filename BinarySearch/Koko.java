import java.util.*;

public class Koko {
    public static int calcRate(int []v, int r){
        int n = v.length;
        int sum = 0;
        System.out.println("incalc");
        for(int i=0;i<n;i++){
            sum += Math.ceil((double)(v[i]) / (double)(r));
        }
        return sum;
    }
    public static int minimumRateToEatBananas(int []v, int h) {
        // Arrays.sort(v);
        int n = v.length;
        if(n==1) return calcRate(v, h);
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = max < v[i] ? v[i] : max;
        }
        
        int low = 1; int high = max;
        int ans = 1;
        while(low<=high){
            int rate = (low+high)/2;
            int calcR = calcRate(v, rate);
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
        System.out.println(minimumRateToEatBananas(new int[]{3, 6, 2, 8}, 7));
        System.out.println("********");
        System.out.println(minimumRateToEatBananas(new int[]{7, 15, 6, 3}, 8));
        System.out.println("********");
        System.out.println(minimumRateToEatBananas(new int[]{9}, 2));
    }
}
