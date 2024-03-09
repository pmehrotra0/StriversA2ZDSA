/* https://www.codingninjas.com/studio/problems/armstrong-number_1462443 */
public class Armstrong 
{
	public static boolean isArmstrong(int n)
	{
		int temp = n;
	    int nod = (int)(Math.log10(n)+1);
		int x = 0;
		while(n!=0){
			int rem = n%10;
			x = x + (int)(Math.pow(rem, nod));
			n = n/10;
		}
		return temp == x;
	}

    public static void main(String args[]){
        boolean flag = isArmstrong(153);
        System.out.println(flag);
    }

}

