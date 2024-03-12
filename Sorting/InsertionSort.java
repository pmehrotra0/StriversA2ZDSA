/* https://www.codingninjas.com/studio/problems/insertion-sort_624381 */
public class InsertionSort {

    public static void sort1(int arr[]){
        int n=arr.length;

        for(int i=0;i<n;i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
                j--;
            }
        }
    }

    public static void sort(int arr[]){ //simplified
        int n = arr.length;

        for(int i=1;i<n;i++){
            int j = i-1;
            int temp = arr[i];
            while(j >= 0 && arr[j] > temp){
                    arr[j+1] = arr[j];
                    j--;
            }
            arr[j+1] = temp;
            System.out.println(java.util.Arrays.toString(arr));
        }
    }
    
    public static void main(String[] args) {
        int arr[] = new int[]{8, 6, 2, 5, 1};
        sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
        arr = new int[]{1,2,3};
        sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
        arr = new int[]{10,9,8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
        arr = new int[]{4,3,2,10,12,1,5,6};
        sort1(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
