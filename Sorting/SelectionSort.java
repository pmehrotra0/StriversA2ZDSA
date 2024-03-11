/* https://www.codingninjas.com/studio/problems/selection-sort_624469 */
public class SelectionSort {
    public static int[] sort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int index=i, min = Integer.MAX_VALUE;
            for(int j=i+1;j<n;j++){
                if(arr[j] < min){
                    index = j;
                    min = arr[j];
                }
            }
            if(arr[i] > arr[index]){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int arr[] = new int[]{8, 6, 2, 5, 1};
        int res[] = sort(arr);
        System.out.println(java.util.Arrays.toString(res));

    }
}
