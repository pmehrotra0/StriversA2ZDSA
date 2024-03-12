/* https://www.codingninjas.com/studio/problems/merge-sort_5846 */
public class Merge {

    public static void sort(int arr[], int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int arr[], int low, int mid, int high){
        int temp[] = new int[high-low+1];
        int i = low, j = mid+1;
        int index = 0;
        while(i <= mid && j<=high){
            if(arr[i] < arr[j]){
                temp[index] = arr[i];
                i++;
                index++;
            }
            else{
                temp[index] = arr[j];
                j++;
                index++;
            }
        }
        while(i<=mid){
            temp[index++] = arr[i++];
        }
        while(j<=high){
            temp[index++] = arr[j++];
        }
        System.out.println(java.util.Arrays.toString(temp));
        for(int p=low;p<=high;p++){
            arr[p] = temp[p-low];
        }
    }

    public static void main(String[] args) {   
        int arr[] = new int[]{8, 6, 2, 5, 1};
        sort(arr, 0, 4);
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(java.util.Arrays.toString(arr));
        arr = new int[]{10,9,8,7,6,5,4,3,2,1};
        sort(arr, 0, 9);
    }
}
