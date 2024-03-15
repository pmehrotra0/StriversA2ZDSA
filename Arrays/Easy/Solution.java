public class Solution {
    public static int getSingleElement(int []arr){
        int i=0;
        int n=arr.length;
        while(i<n){
            if(i+1 < n && arr[i] == arr[i+1]){
                i+=2;
                continue;
            }
            else{
                break;
            }
        }
        return arr[i];
    }
    public static int longestSubarrayWithSumK(int []a, long k) {
        int max = 0;
        int n = a.length;
        for(int i=0;i<n;i++){
            int sum=0;
            int j=i;
            int len=0;
            while(j<n && sum+a[j]<=k){
                sum = sum+a[j];
                j++;
                len++;
            }
            System.out.println(sum+" "+len);
            if(max<len){
                max=len;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int res = getSingleElement(new int[]{1,1,2,2,3,3,4,5,5});
        System.out.println(res);
        int res = longestSubarrayWithSumK(new int[]{1,2,3,1,1,1,1}, 3);
        System.out.println(res);
    }
}