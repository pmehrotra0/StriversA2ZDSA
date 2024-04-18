/* https://www.naukri.com/code360/problems/smallest-divisor-with-the-given-limit_1755882 */
public class SmallestDivisor {
    public static int smallestDivisor(int arr[], int limit) {
        // Write your coder here
        int min=Integer.MAX_VALUE, max= Integer.MIN_VALUE;
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = min > arr[i] ? arr[i] : min;
            max = max < arr[i] ? arr[i] : max; 
        }
        int low=1, high=max; //check from 1 to max 
        while(low<=high){
            int mid = (low+high)/2;
            int divisor = calTotal(arr, mid);
            System.out.println(mid +" "+divisor);
            if(divisor <= limit){
                System.out.println(ans +" "+mid);
                ans = ans > mid ? mid : ans;
                high = mid-1;
            }
            else{
                low =mid+1;
            }
        }
        return low;
    }
    public static int calTotal(int arr[], int div){
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += Math.ceil((double)arr[i]/(double)div);
            System.out.println("sum"+sum +" "+ arr[i] +" "+ div);
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(smallestDivisor(new int[]{1, 2, 3, 4, 5}, 8));
        System.out.println("*****");
        System.out.println(smallestDivisor(new int[]{8, 4, 2, 3 }, 10));
    }
}
