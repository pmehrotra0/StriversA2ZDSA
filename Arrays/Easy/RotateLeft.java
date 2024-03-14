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
    static int[] rotateArrayk(int[] arr, int n, int k){
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
    public static void main(String[] args) {
        int res[] = rotateArray1(new int[]{1,2,3,4,5}, 5);
        System.out.println(java.util.Arrays.toString(res));
        res = rotateArrayk(new int[]{1,2,3,4,5}, 5, 3);
        System.out.println(java.util.Arrays.toString(res));
    }
}
