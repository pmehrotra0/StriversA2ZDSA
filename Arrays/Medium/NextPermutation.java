/* https://leetcode.com/problems/next-permutation/submissions/1209232242/ */
import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {

    public static int[] nextPermutation(int a[]){
        int n = a.length;
        int ind = -1;
        for(int i=n-2;i>=0;i--){
            if(a[i] < a[i+1]){
                ind = i;
                break;
            }
        }
        System.out.println(ind);
        if(ind == -1){ 
            Collections.reverse(Arrays.asList(a));
            return a;
        }
        else{
            int min = Integer.MAX_VALUE;
            int mind = -1;
            for(int i = n-1;i>ind;i--){
                if(a[i] > a[ind]){
                    if(min > a[i]){
                        min = a[i];
                        mind = i;
                    }
                }
            }
            int tmp = a[ind];
            a[ind] = a[mind];
            a[mind] = tmp;
            System.out.println(min);
            int low = ind+1;
            int high = n-1;
            while(low<high){
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;
                low++;
                high--;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int arr[] = nextPermutation(new int[]{2,1,5,4,3,0,0});
        System.out.println(java.util.Arrays.toString(arr));
        arr = nextPermutation(new int[]{3,2,1});
        System.out.println(java.util.Arrays.toString(arr));
    }
}
