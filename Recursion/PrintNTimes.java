/* https://www.codingninjas.com/studio/problems/-print-n-times_8380707 */
import java.util.ArrayList;
import java.util.List;
public class PrintNTimes {

    public static List<String> printNtimes(int n){
        if(n == 0){
            return new ArrayList<String>();
        }
        List<String> s = printNtimes(--n);
        s.add("Coding Ninja");
        return s;
    }

    public static void main(String[] args) {
        List<String> res = printNtimes(4);
        System.out.println(res);
    }
}