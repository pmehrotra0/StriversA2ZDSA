/* https://www.codingninjas.com/studio/problems/factorial-numbers-not-greater-than-n_8365435 */
public class ReverseArray {
    public static int[] reverse(int low, int high, int []nums){
        if(low<high){
            int temp = nums[high];
            nums[high] = nums[low];
            nums[low] = temp;
            return reverse(low+1, high-1, nums);
        }
        return nums;
    }
    public static int[] reverseArray(int n, int []nums) {
        return reverse(0, n-1, nums);
    }
    public static void main(String[] args) {
        int res[] = reverseArray(5, new int[]{1, 2, 3, 4, 5});
        System.out.println(java.util.Arrays.toString(res));
    }
}
