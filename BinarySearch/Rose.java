/* https://www.naukri.com/code360/problems/rose-garden_2248080 */
public class Rose {
    public static int roseGarden(int[] arr, int r, int b) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            max = max < arr[i] ? arr[i] : max;
            min = min > arr[i] ? arr[i] : min;
        }
        System.out.println("max" +max);
        int low=min, high=max; int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            int noOfB = calcBOpt(arr, r, mid);
            if(noOfB >= b){
                ans = ans > mid ? mid : ans;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        // for(int i=1;i<=max;i++){
        //     int noOfB = calcB(arr, r, i);
        //     System.out.println("day" + i + " " + noOfB);
        //     if(noOfB >= b) return i;
        // }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public static int calcB(int arr[], int r, int day){
        int n = arr.length;
        int cnt = 0;
        for(int i=0;i<arr.length-r+1;){
            boolean willAll = true;
            System.out.println(i+ " " +(i+r));
            for(int j=i;j<i+r;j++){
                if(arr[j] > day){
                    willAll = false;
                    break;
                }
            }
            if(willAll){
                 cnt++;
                 i+=r;
            }
            else{
                i++;
            }
        }
        return cnt;
    }
    public static int calcBOpt(int arr[], int r, int day){
        int noOfB = 0, cnt=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] <= day){
                cnt++;
            }
            else{
                noOfB += (cnt/r);
                cnt = 0;
            }
        }
        noOfB += (cnt/r);
        return noOfB;
    }
    public static void main(String[] args) {
        System.out.println(roseGarden(new int[]{1, 2, 1, 2, 7, 2, 2, 3, 1}, 3, 2));
        System.out.println(roseGarden(new int[]{1, 1, 1, 1}, 1, 1));
    }
}
