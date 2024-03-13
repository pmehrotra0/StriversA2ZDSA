/* https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279 */
public class LargestElement {
    static int largestElement(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i])
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int max = largestElement(new int[]{1, 2, 3, 4,5}, 5);
        System.out.println(max);
    }
}
