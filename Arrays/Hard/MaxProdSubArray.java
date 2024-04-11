/* https://www.naukri.com/code360/problems/subarray-with-maximum-product_6890008 */
import java.util.HashSet;
import java.util.Set;

public class MaxProdSubArray {
    public static int subarrayWithMaxProduct(int []arr){
        int max= Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int prod = arr[i];
            max= max< prod? prod : max;
            for(int j=i+1;j<n;j++){
                prod = prod * arr[j];
                System.out.println(i + " "+ j + " " + max + " " +prod);
                max= max< prod? prod : max;
            }
        }
        return max;
    }
    public static int subarrayWithMaxProductOpt(int []arr){
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int n = arr.length;
        for(int i=0;i<n;i++){
            prefix = prefix*arr[i];
            max = max < prefix ? prefix : max;
            prefix = prefix == 0? 1 : prefix;
        }
        prefix = 1;
        for(int i=n-1;i>=0;i--){
            prefix = prefix*arr[i];
            max = max < prefix ? prefix : max;
            prefix = prefix == 0? 1 : prefix;
        }
        return max;
        
    }
    public static void main(String[] args) {
        System.out.println(subarrayWithMaxProductOpt(new int[]{1,-2,3,-4}));
    }
}
