/* https://takeuforward.org/arrays/find-the-missing-number-in-an-array/ */
/* https://www.codingninjas.com/studio/problems/missing-number_6680467 */
public class MissingNumber {
    public static int missing(int a[], int n){//TC:O(2n)SC:O(n)
        int res[] =new int[n];
        for(int i=0;i<a.length;i++){
            res[a[i] - 1] = 1;
        }
        int i =0;
        while(i<n){
            if(res[i] == 0){
                return i+1;
            }
            i++;
        }
        return i;
    }
    public static int missingOpt(int a[], int n){ //T:O(n) SC:O(1)
        int sum1 = (n*(n+1))/2;
        int sum2 = 0;
        for(int i=0;i<a.length;i++){
            sum2+=a[i];
        }
        return sum1-sum2;
    }
    public static int missingOpt1(int a[], int n){
        int xor1 = 0;
        for(int i=0;i<a.length;i++){
            xor1 = xor1 ^ a[i] ^ (i+1);
        }
        xor1 = xor1^n;
        return xor1;
    }
    public static void main(String[] args) {
        int res = missing(new int[]{1,4,3,2}, 5);
        System.out.println(res);
        res = missingOpt(new int[]{1,4,3,5}, 5);
        System.out.println(res);
        res = missingOpt1(new int[]{1,2,3,4}, 5);
        System.out.println(res);
    }
}
