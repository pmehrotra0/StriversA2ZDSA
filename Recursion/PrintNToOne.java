
/* https://www.codingninjas.com/studio/problems/n-to-1-without-loop_8357243 */
public class PrintNToOne
{
    public static void addNum(int i, int x, int arr[]){
        if(x==0){ return; }
        arr[i] = x;
        i++;
        x--;
        addNum(i, x, arr);
    }
    public static int[] printNos(int x) {
        int arr[]=new int[x];
        addNum(0, x, arr);
        return arr;
    }

    public static void main(String[] args) {
        int res[]= printNos(10);
        System.out.println(java.util.Arrays.toString(res));
    }
}