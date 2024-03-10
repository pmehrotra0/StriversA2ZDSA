/* https://www.codingninjas.com/studio/problems/print-1-to-n_628290 */
import java.util.ArrayList;

public class PrintToN {

    public static void addNum(int i, int x, int arr[]){ //Non-primitive type are send as call by ref in java.   
        if(i>x){ return; }
        arr[i-1] = i;
        i++;
        addNum(i, x, arr);
    }
    public static int[] printNos(int x) {
        int arr[]=new int[x];
        addNum(1, x, arr);
        return arr;
    }

    public static void main(String[] args) {
        int ans[] = printNos(10);
        System.out.println(java.util.Arrays.toString(ans));
    }
}