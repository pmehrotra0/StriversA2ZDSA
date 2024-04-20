/* https://www.naukri.com/code360/problems/sum-of-all-divisors_8360720 */
public class SumOfAllDivisor {
    public static long sumFacts(int n){
        if(n==1) return 1;
        long sum=1+n;
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                int rem = n/i;
                if(i*i != n){
                    sum+=(i+rem);
                }
                else{
                    sum+=(i);
                }
            }
        }
        return sum;
    }
    public static int sumOfAllDivisors(int n){
        if(n==1) return 1;
       long fsum = sumFacts(n) + sumOfAllDivisors(n-1);
       return (int)fsum;
    }
    public static int sumOfAllDivisorsOpt(int n){
        int sum = 0;
        for(int i=n;i>=1;i--){
            sum += ((n/i)*i);
        }
        return (int)sum;
     }
    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(30000));
    }
}
