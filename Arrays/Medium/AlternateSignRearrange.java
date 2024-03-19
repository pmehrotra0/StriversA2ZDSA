/* https://www.codingninjas.com/studio/problems/alternate-numbers_6783445 */
public class AlternateSignRearrange {
    public static int[] alternateNumbers(int []a) {
        int ppos = 0, npos = 1;
        int n = a.length;
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            if(a[i] >=0 ){
                res[ppos] = a[i];
                ppos += 2;
            }
            else{
                res[npos] = a[i];
                npos +=2;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, -4, -5};
        int res[] = alternateNumbers(a);
        System.out.println(java.util.Arrays.toString(res));
    }
}
