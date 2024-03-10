import java.util.ArrayList;
import java.util.List;

public class FindFacts {
    public static List<Long> factorials(long i, long n, List<Long> ans){
        if(i>n) return ans;
        if(n%i == 0){
            ans.add(i);
        }
        i++;
        return factorials(i, n, ans);
    }
    public static List<Long> factorialNumbers(long n) {
        List<Long> facts = new ArrayList<>();
        return factorials(1, n, facts);
    }
    public static void main(String[] args) {
        List<Long> res = factorialNumbers(6);
        System.out.println(res);;
    }
}
