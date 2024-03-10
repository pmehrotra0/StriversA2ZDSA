public class SumN {
    public static long sumFirstN(long n) {
        if(n==0) return 0;
        return n+sumFirstN(n-1);
    }
    public static void main(String[] args) {
        long sum = sumFirstN(100);
        System.out.println(sum);
    }
    
}
