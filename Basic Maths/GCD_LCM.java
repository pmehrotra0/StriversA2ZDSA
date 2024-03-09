/* https://www.codingninjas.com/studio/problems/hcf-and-lcm_840448 */
public class GCD_LCM {
    public static int calcGCD(int n, int m){
        if(n<m){
            int temp = m;
            m=n;
            n=temp;
        }
        while(m != 0){
            int temp = n%m;
            n=m;
            m=temp;
        }
        return n;
    }

    public static int calcLCM(int n, int m){
        int gcd = calcGCD(n,m);
        return (int)((n*m)/gcd);

    }

    public static void main(String[] args) {
        System.out.println(calcGCD(20,30));
        System.out.println(calcLCM(20,30));
        System.out.println(calcGCD(0,0));
        System.out.println(calcGCD(0, 1));
        System.out.println(calcGCD(0, 100));
    }
}