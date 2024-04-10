/* https://www.naukri.com/code360/problems/missing-and-repeating-numbers_6828164 */
import java.util.Arrays;

public class MissingNumber {
    public static int[] findMissingRepeatingNumbers(int []a) {
        int res[] = new int[2];
        int hash[] = new int[a.length];

        for(int i=0;i<a.length;i++){
            hash[a[i]-1]++;
        }
        System.out.println(java.util.Arrays.toString(hash));

        for(int i=0;i<a.length;i++){
            if(hash[i] == 0){
                res[1] = i+1;
            }
            if(hash[i] == 2){
                res[0] = i+1;
            }
        }
        return res;
    }
    
    public static int[] findMissingRepeatingNumbersMath(int []a) {
        long long s = 0;
        long s2 = 0;
        int n = a.length;
        for(int i=0;i<n;i++){
            s+=a[i];
            s2 += (long)(a[i] * a[i]);
        }
        long sn = (n*(n+1))/2;
        long s2n = (n * (n+1) * (2*n + 1))/ 6;
        long x_min_y = s - sn; //x-y x=repeating y=missing 
        long x_plus_y = (s2 - s2n);
        x_plus_y = x_plus_y/x_min_y;
        int x = (int)(x_min_y + x_plus_y) /2;
        int y = (int)(x - x_min_y);
        return new int[]{x,y};
    }
    
    public static void main(String[] args) {
        int res[] = findMissingRepeatingNumbersMath(new int[]{4,3,6,2,1,1 });
        System.out.println(java.util.Arrays.toString(res));
    }
}
