/* https://www.naukri.com/code360/problems/capacity-to-ship-packages-within-d-days_1229379 */
public class WeightCapacity {
    public static int leastWeightCapacity(int[] weights, int d) {
        int maxWeight = Integer.MIN_VALUE, totalWeight= 0;
        int n = weights.length;
        for(int i=0;i<n;i++){
            totalWeight += weights[i];
            maxWeight = maxWeight < weights[i] ? weights[i] : maxWeight;
        }
        int low = maxWeight, high = totalWeight;
        while(low<=high){
            int mid = (low+high)/2;
            int noOfDays = calDaysTaken(weights, mid);
            System.out.println("weights " + mid + " " + noOfDays);
            if(noOfDays <= d){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public static int calDaysTaken(int weights[], int capacity){
        int total = 0;
        int cnt = 0;
        int n = weights.length;
        for(int i=0;i<n;){
            int tmp = cnt+weights[i];
            if(tmp < capacity){
                cnt+=weights[i];
                i++;
            }
            else if(tmp == capacity){
                i++;
                total++;
                cnt=0;
            }
            else{
                cnt=0;
                total++;
            }
            System.out.println(cnt + " " + i +" " +capacity +" "+ total);
        }
        if(cnt != 0){
            total += 1;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(leastWeightCapacity(new int[]{5, 4, 5, 2, 3, 4, 5, 6}, 5));
    }
}
