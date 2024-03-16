/* https://www.codingninjas.com/studio/problems/left-rotate-an-array-by-one_5026278 */
/* https://www.codingninjas.com/studio/problems/rotate-array_1230543 */
public class RotateLeft {
    static int[] rotateArray1(int[] arr, int n) {
        int j=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = j;
        return arr;

    }
    static int[] rotateArrayk(int[] arr, int n, int k){//SC:O(n)TC:O(n)
        int res[]=new int[n];
        int ind = 0;
        for(int i=k;i<n;i++){
            res[ind++] = arr[i];
        }
        for(int i=0;i<k;i++){
            res[ind++] = arr[i];
        }
        return res;
    }
    static void reverse(int[] arr, int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;high--;
        }
    }
    static int[] rotateArraykOptimal (int[] arr, int n, int k){ //SC:O(1) TC:O(2n)
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
        return arr;
    }
    public static void main(String[] args) {
        int res[] = rotateArray1(new int[]{1,2,3,4,5}, 5);
        System.out.println(java.util.Arrays.toString(res));
        res = rotateArrayk(new int[]{1,2,3,4,5}, 5, 3);
        System.out.println(java.util.Arrays.toString(res));
        res = rotateArraykOptimal(new int[]{1,2,3,4,5,6,7}, 7, 3);
        System.out.println(java.util.Arrays.toString(res));
    }
}
