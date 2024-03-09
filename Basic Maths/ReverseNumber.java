/* https://www.codingninjas.com/studio/problems/reverse-of-a-number_893271 */
public class ReverseNumber {
	public static long reverseNumber(long n) {
		long rev = n%10;
		n=n/10;
		while(n != 0){
			long rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		return rev;
	}

    public static void main(String args[]){
        long n = reverseNumber(40100);
        System.out.println(n);
    }

}
