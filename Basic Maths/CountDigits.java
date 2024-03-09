/* https://www.codingninjas.com/studio/problems/count-digits_8416387 */

public class CountDigits {
    public static int countDigits(int n){
        int nod = 0;
        int x = n;
        while(x != 0){
            int rem = x%10;
            if(rem != 0 && n%rem == 0){
                nod++;
            }
            x = x/10;
        }
        return nod;
    }

    public static void main(String args[]){
        int n = countDigits(336);
        System.out.println(n);
    }

}