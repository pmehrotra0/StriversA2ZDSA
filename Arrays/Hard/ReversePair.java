/* https://www.naukri.com/code360/problems/team-contest_6840309 */
import java.util.Arrays;

public class ReversePair {
    public static int cnt = 0;
    public static void sort(int arr[], int low, int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        countPair(arr, low, mid, high);
        merge(arr, low, mid, high);
    }

    public static void countPair(int arr[], int low, int mid, int high){
        int right = mid+1;
        for(int left=low;left<=mid;left++){
            while(right<=high){
                if(arr[left] > (arr[right]*2)){
                    right++;
                }
                else{ 
                    break;
                }
            }
            cnt += (right - (mid+1));
        }
    }

    public static void merge(int arr[], int low, int mid, int high){
        int temp[] = new int[high-low+1];
        int ind = 0;
        int i=low, j=mid+1;
        while(i<=mid && j<=high){
            if(arr[i] > arr[j]){
                temp[ind++] = arr[j++];
            }
            else{
                temp[ind++] = arr[i++];
            }
        }
        while(i<=mid){
            temp[ind++] = arr[i++];
        }
        while(j<=high){
            temp[ind++] = arr[j++];
        }
        System.out.println(Arrays.toString(temp));
        for(int k=low;k<=high;k++){
            arr[k] = temp[k-low];
        }
    }

    public static int team(int []skill, int n){
        sort(skill, 0, n);
        System.out.println(Arrays.toString(skill));
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(team(new int[]{100, 49, 201, 100}, 4));
    }
}
