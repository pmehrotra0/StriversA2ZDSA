/* https://www.naukri.com/code360/problems/reverse-bits_2181102 */
public class ReverseBits {
    public static long reverseBits(long n) {
		long power = (long)Math.pow(2, 31);
		long res = 0;
		while(n>0){
			long rem = n%2;
			n=n/2;
			res += rem*power;
			power=power/2;
		}
		return res;
	}
    public static void main(String[] args) {
        System.out.println(reverseBits(12));
    }
}
