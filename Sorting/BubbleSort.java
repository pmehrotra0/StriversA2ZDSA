public class BubbleSort {
    public static void sort(int arr[]){
        int n =arr.length;

        for(int i=n-1;i>=0;i--){
            int didSwap = 0;
            for(int j=0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[]{8, 6, 2, 5, 1};
        sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
