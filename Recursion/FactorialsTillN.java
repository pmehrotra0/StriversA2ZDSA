/* https://www.codingninjas.com/studio/problems/factorial-numbers-not-greater-than-n_8365435 */
import java.util.ArrayList;
import java.util.List;

public class FactorialsTillN {
    public static List<Long> factorials(long index, long fact, long n, List<Long> factslist){
        if(fact <= n){
            factslist.add(fact);
            index++;
            fact = fact*index;
            return factorials(index, fact, n, factslist);
        }
        return factslist;
    }

    
    public static List<Long> factorialNumbers(long n) {
        List<Long> factslist = new ArrayList<>();
        return factorials(1, 1, n, factslist);
    }

    public static void main(String[] args) {
        List<Long> res = factorialNumbers(7);
        System.out.println(res);
    }
}

