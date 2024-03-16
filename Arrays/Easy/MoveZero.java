/*https://www.codingninjas.com/studio/problems/ninja-and-the-zero-s_6581958 */
public class MoveZero {
    public static int[] moveZeros(int n, int []a) { //TC:O(2n) SC:o(n)
        int res[] = new int[n];
        int ind=0, i=0;
        while(i<n){
            if(a[i] != 0){
                res[ind++] = a[i++];
            }
            else{
                i++;
            }
        }
        while(ind<n){
            res[ind++]=0;
        }
        return res;
    }
    public static int[] moveZerosOpt(int n, int a[]){ //TC:O(n^2)(worst case) SC:O(1)
        int i=0;
        while(i<n){
            if(a[i] == 0){
                int j=i+1;
                // System.out.println("here" + i + " "+java.util.Arrays.toString(a));
                while(j<n && a[j] == 0){
                    j++;
                }
                // System.out.println("here" + j);
                if(j<n){
                    // System.out.println("now" + j + " "+a[j-1]);
                a[i] = a[j];
                a[j] = 0;
                // System.out.println("now" + java.util.Arrays.toString(a));
                }
                i++;
            }
            else{
                i++;
            }
        }
        return a;
    }
    public static int[] moveZeroSimplified(int n, int a[]){ //TC:O(n) SC:O(1)
        int j=0;
        while(j<n && a[j] !=0){
            j++;
        }
        for(int i=j+1;i<n;i++){
            if(a[i] !=0){
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;

    }
    public static void main(String[] args) {
        int res[]=moveZeros(5, new int[]{1,2,0,0,3});
        System.out.println(java.util.Arrays.toString(res));
        res=moveZerosOpt(5, new int[]{1,2,0,0,3});
        System.out.println(java.util.Arrays.toString(res));
        res=moveZeroSimplified(5, new int[]{1,2,0,0,3});
        System.out.println(java.util.Arrays.toString(res));
        res=moveZeroSimplified(5, new int[]{0, 0,0,0,3});
        System.out.println(java.util.Arrays.toString(res));
        res=moveZeroSimplified(5, new int[]{0, 0,0,0,0});
        System.out.println(java.util.Arrays.toString(res));

        res=moveZeroSimplified(3, new int[]{1,2,3});
        System.out.println(java.util.Arrays.toString(res));
    }
}
