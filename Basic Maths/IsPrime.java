/* https://www.codingninjas.com/studio/problems/check-prime_624934 */
public class IsPrime {
	public static String isPrime(int num) { //O(√n)
		
		if(num < 2) return "NO";
        if(num == 2) return "YES";
		if(num%2 == 0) return "NO";
		for(int i=3; i*i<=num; i+=1){
			if(num % i == 0) return "NO";
		}
		return "YES";
	}

    public static void main(String args[]){
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(4));
        System.out.println(isPrime(17));
    }
}