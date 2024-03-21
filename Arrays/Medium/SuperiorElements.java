
import java.util.*;
public class SuperiorElements {

    public static List<Integer> superiorElements(int arr[]){
        List<Integer> res = new ArrayList<Integer>();
        int n = arr.length;
        int max = arr[n-1];
        res.add(max);
        for(int i=n-2;i>=0;i--){
            if(max < arr[i]){
                max = arr[i];
                res.add(max);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> res = superiorElements(new int[]{1, 2, 3, 2});
        System.out.println(res);
        res = superiorElements(new int[]{5,4,3});
        System.out.println(res);
    }
}
