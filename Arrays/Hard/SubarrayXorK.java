/* https://www.naukri.com/code360/problems/subarrays-with-xor-k_6826258 */

import java.util.HashMap;
import java.util.Map;

public class SubarrayXorK {
    public static int subarraysWithSumK(int []a, int b) {
        int cnt = 0;
        int n = a.length;
        for(int i=0;i<n;i++){
            int xorr = 0;
            for(int j=i;j<n;j++){
               xorr = xorr ^ a[j];

                // step 3:check XOR and count:
                if (xorr == b) cnt++;
            }
        }
        return cnt;
    }
    public static int subarraysWithSumKOpt(int []a, int b) {
        int n = a.length; //size of the given array.
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>(); //declaring the map.
        mpp.put(xr, 1); //setting the value of 0.
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            // prefix XOR till index i:
            xr = xr ^ a[i];

            //By formula: x = xr^k:
            int x = xr ^ b;

            // add the occurrence of xr^k
            // to the count:
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }

            // Insert the prefix xor till index i
            // into the map:
            if (mpp.containsKey(xr)) {
                mpp.put(xr, mpp.get(xr) + 1);
            } else {
                mpp.put(xr, 1);
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int len = subarraysWithSumK(new int[]{1, 2, 3, 2}, 2);
        System.out.println(len);
    }
}
