/* https://www.codingninjas.com/studio/problems/palindrome-number_624662 */
public class Palindrome {
    public static boolean palindromeNumber(int n){
        int temp = n;
        int rev = n%10;
		n=n/10;
		while(n != 0){
			int rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		return temp == rev;
    }
    public static void main(String args[]){
        boolean flag = palindromeNumber(54345);
        System.out.println(flag);
        flag = palindromeNumber(123);
        System.out.println(flag);
    }
}