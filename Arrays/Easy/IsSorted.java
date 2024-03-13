/* https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957 */
public class IsSorted {
    public static int isSorted(int n, int []arr) {
        int isSorted = 1;
        int i = 0;
        while(i<n-1){
            if(arr[i+1] < arr[i] ){
                isSorted = 0;
                break;
            }
            i++;
        }
        return isSorted;
    }

    public static void main(String[] args) {
        int flag = isSorted(5, new int[]{1, 2, 3, 4,5});
        System.out.println(flag);
        flag = isSorted(5, new int[]{1, 2, 6, 4,5});
        System.out.println(flag);
    }
}
