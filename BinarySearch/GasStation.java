/* https://www.naukri.com/code360/problems/minimise-max-distance_7541449 */
import java.util.Arrays;
import java.util.PriorityQueue;

public class GasStation {
    public static class Pair {
        double first;
        int second;

        Pair(double first, int second) {
            this.first = first;
            this.second = second;
        }

        public String toString() {
            return first+" "+second;
        }
    }

    public static double MinimiseMaxDistanceOpt(int []arr, int K){
        int n = arr.length;
        int placed[] = new int[n-1];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.first, a.first));

        for(int i=0;i<n-1;i++){
            pq.add(new Pair(arr[i+1]-arr[i], i));
        }
        System.out.println(pq.toString());
        for(int i=0;i<K;i++){
            System.out.println(pq.toString() +" "+i+"th " +Arrays.toString(placed));
            Pair top = pq.poll();
            placed[top.second]++;
            double nDist = (arr[top.second+1] - arr[top.second]) / (double)(placed[top.second] + 1);
            pq.add(new Pair(nDist, top.second));
        }
        System.out.println(Arrays.toString(placed));
        System.out.println(pq.toString());
        return pq.poll().first;
    }
    
    public static double MinimiseMaxDistance(int []arr, int K){
        int n = arr.length;
        int placed[] = new int[n-1];
        for(int i=0;i<K;i++){
            double maxd = Integer.MIN_VALUE;
            int ind = 0;
            for(int j=0;j<n-1;j++){
                double dist = (double)(arr[j+1] - arr[j])/(double)(placed[j]+1);
                if(maxd < dist){
                    maxd = dist;
                    ind = j;
                }
            }
            placed[ind]++;
        }
        System.out.println(Arrays.toString(placed));
        double minDist = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            double dist = (double)(arr[i+1] - arr[i])/(double)(placed[i] +1);
            if(minDist<dist){
                minDist=dist;
            }
        }
        return minDist;
    }
    
    public static double MinimiseMaxDistanceBS(int []arr, int K){
        int n=arr.length;
        double maxdist = -1;
        for(int i=0;i<n-1;i++){
            double dist = arr[i+1]-arr[i];
            if(dist>maxdist){
                maxdist = dist;
            }
        }
        // System.out.println(maxdist);
        double low=0, high=maxdist;
        double ans = -1;
        while((high-low) > Math.pow(10, -6)){
            double mid = (low+high)/2.0;
            int gasStationPlaced = placeGasStation(arr, K, mid);
            // System.out.println(mid +" "+gasStationPlaced +" "+K);
            if(gasStationPlaced == -1 || gasStationPlaced > K){
                low = mid;
            }
            else{
                ans = high;
                high = mid;
            }
        }
        return high;
    }
    public static int placeGasStation(int arr[], int K, double mid){
        int n=arr.length;
        int placed = 0;
        for(int i=0;i<n-1;i++){
            int dist = arr[i+1]-arr[i];
            if(mid == 0) return -1;
            int newp =(int)(dist/mid);
            // System.out.println(dist+" ** "+ i +" " + placed +" "+newp +" "+(dist%mid == 0));
            if(dist%mid == 0){
                placed += (newp-1);
            }
            else{
                placed += newp;
            }
            if(placed > K) return -1;
        }
        return placed;
    }
    public static int numberOfGasStationsRequired(double dist, int[] arr) {
        int n = arr.length; // size of the array
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            int numberInBetween = (int)((arr[i] - arr[i - 1]) / dist);
            if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {
                numberInBetween--;
            }
            cnt += numberInBetween;
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(MinimiseMaxDistanceBS(new int[]{1,2,3,4,5,6,7}, 6));
        System.out.println(MinimiseMaxDistanceBS(new int[]{1,13,17,23}, 5));
        System.out.println(MinimiseMaxDistanceBS(new int[]{1,2,3,4,5,6,7,8,9,10}, 1));
        System.out.println(MinimiseMaxDistanceBS(new int[]{4,6,10}, 4));

    }
}
