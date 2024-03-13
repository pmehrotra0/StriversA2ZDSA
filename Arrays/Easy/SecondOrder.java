/* https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960 */
public class SecondOrder {
    public static int[] getSecondOrderElements(int []arr, int n) {
        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                smax = max;
                max = arr[i];
            }
            if(smax<arr[i] && arr[i]<max){
                smax = arr[i];
            }
            if(min>arr[i]){
                smin = min;
                min = arr[i];
            }
            if(smin>arr[i] && arr[i]>min){
                smin = arr[i];
            }
            System.out.println(max+" "+smax+" "+min+" "+smin);
        }
        return new int[]{smax, smin};
    }
    public static void main(String[] args) {
        int max[] = getSecondOrderElements(new int[]{1, 2, 3, 4,5}, 5);
        System.out.println(java.util.Arrays.toString(max));
    }
}
