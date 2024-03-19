/* https://leetcode.com/problems/maximum-subarray/description/ */
/* https://www.codingninjas.com/studio/problems/maximum-subarray-sum_630526 */
public class MaxSubarray {

    public static int maxSub(int arr[]){
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            int sum=arr[i];
            if(max < sum){
                max = sum;
            }
            for(int j=i+1;j<n;j++){
                sum +=arr[j];
                if(max < sum){
                    max = sum;
                }
            }
        }
        return max;
    }

    public static int kadane(int arr[]){
        int n= arr.length;
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(max < sum){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }

    public static int[] kadaneGetMaxSubArray(int arr[]){
        int n= arr.length;
        int max=0;
        int sum=0;
        int low=0, high=0;
        for(int i=0;i<n;i++){
            if(sum == 0) low=i;
            sum=sum+arr[i];
            if(max < sum){
                max = sum;
                high = i;
            }
            if(sum<0){
                sum = 0;
                // low = i;
            }
        }
        return new int[]{low, high};
    }

    public static void main(String[] args) {
        int res = maxSub(new int[]{1, 2, 7, -4, 3, 2, -10, 9, 1});
        System.out.println(res);
        res = maxSub(new int[]{10,20,-30,40,-50,60});
        System.out.println(res);
        res = maxSub(new int[]{-3,-4,-5});
        System.out.println(res);

        res = kadane(new int[]{1, 2, 7, -4, 3, 2, -10, 9, 1});
        System.out.println(res);
        res = kadane(new int[]{10,20,-30,40,-50,60});
        System.out.println(res);
        res = kadane(new int[]{-3,-4,-5});
        System.out.println(res);

        int ans[] = kadaneGetMaxSubArray(new int[]{1, 2, 7, -4, 3, 2, -10, 9, 1});
        System.out.println(ans[0] + " " + ans[1]);
        ans = kadaneGetMaxSubArray(new int[]{10,20,-30,40,-50,60});
        System.out.println(ans[0] + " " + ans[1]);
        ans = kadaneGetMaxSubArray(new int[]{-3,-4,-5});
        System.out.println(ans[0] + " " + ans[1]);
    }
}
