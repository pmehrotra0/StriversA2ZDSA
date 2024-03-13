/* https://www.codingninjas.com/studio/problems/quick-sort_5844 */
public class QuickSort {

    public static void sort(int arr[], int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    public static int partition(int arr[], int low, int high){
        int pivot = low;
        int i = low, j = high;
        while(i<j){
            while(arr[i] <= arr[pivot] && i<=high-1){
                i++;
            }
            while(arr[j] > arr[pivot] && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{8, 6, 2, 5, 1};
        sort(arr, 0, 4);
        System.out.println(java.util.Arrays.toString(arr));
        arr = new int[]{3,2,1};
        sort(arr,0,2);
        System.out.println(java.util.Arrays.toString(arr));
        arr = new int[]{10,9,8,7,6,5,4,3,2,1};
        sort(arr,0,9);
        System.out.println(java.util.Arrays.toString(arr));
        arr = new int[]{4,3,2,10,12,1,5,6};
        sort(arr,0,7);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
