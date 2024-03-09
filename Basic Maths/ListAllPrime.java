/* https://www.codingninjas.com/studio/problems/all-prime-numbers_624970 */
import java.util.*;

public class ListAllPrime {
    public static List<Integer> allPrimeIn(int n){  //Sieve of Eratosthenes O(nloglogn)
        List<Integer> res = new ArrayList<>();
        if(n<=0) return new ArrayList<>();
        Boolean list[]= new Boolean[n+1];

        for(int i=0;i<=n;i++){
            list[i] = true;
        }

        for(int p=2; p*p<=n; p++){
            if(list[p]){
                for(int i = p*2; i<=n; i+=p){
                    list[i] = false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(list[i]){
                res.add(i);
            }
        }

        return res;
    }
    public static void main(String args[]){
        List<Integer> list= allPrimeIn(100);
        System.out.println(list.toString());
        list= allPrimeIn(89);
        System.out.println(list.toString());
        list= allPrimeIn(1);
        System.out.println(list.toString());
        list= allPrimeIn(-92);
        System.out.println(list.toString());
    }
}
