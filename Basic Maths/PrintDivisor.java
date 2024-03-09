/* https://www.codingninjas.com/studio/problems/print-all-divisors-of-a-number_1164188 */
import java.util.*;
public class PrintDivisor{

    public static List<Integer> printDivisorsOpt(int n){ //O(√n)
        List<Integer> list=new ArrayList<Integer>();
        for(int i=1; i<=Math.sqrt(n) ;i++){
            if(n%i == 0){
                list.add(i);
                if( n/i != i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }

    public static List<Integer> printDivisors(int n) { //O(n)
        List<Integer> list=new ArrayList<Integer>();
        for(int i=1; i<=n ;i++){
            if(n%i == 0){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String args[]){
        List<Integer> sol = printDivisors(10);
        System.out.println(sol.toString());
        sol = printDivisorsOpt(36);
        System.out.println(sol.toString());
    }
}