/* https://www.codingninjas.com/studio/problems/count-frequency-in-a-range_8365446 */
public class ArrFreq {
    public static int[] countFrequency(int n, int x, int []nums){
        int freq[] = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]-1 < n)
            freq[nums[i]-1] +=1;
        }
        return freq;
    }
    public static void main(String[] args) {
        int res[] = countFrequency(6, 9, new int[]{1, 3, 1, 9, 2, 7});
        System.out.println(java.util.Arrays.toString(res));
    }
}
