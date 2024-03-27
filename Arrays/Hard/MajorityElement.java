/* https://www.naukri.com/code360/problems/majority-element_6915220 */
import java.util.*;

public class MajorityElement {
    public static List< Integer > majorityElement(int []v) {
        int n = v.length;
        int el1=Integer.MIN_VALUE,cnt1=0, el2=Integer.MIN_VALUE, cnt2=0;
        for(int i=0;i<n;i++){

            

            if(cnt1 == 0 && v[i] != el2){
                el1 = v[i];
                cnt1++;
            }
            else if(cnt2 == 0 && v[i] != el1){
                el2 = v[i];
                cnt2++;
            }
            else if(v[i] == el1){
                cnt1++;
            }
            else if(v[i] == el2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        cnt1 = 0; cnt2=0;
        for(int i=0;i<n;i++){
            if(v[i] == el1){
                cnt1++;
                if(cnt1 > n/3 && !res.contains(el1)){
                    res.add(el1);
                }
            }
            if(v[i] == el2 && !res.contains(el2)){
                cnt2++;
                if(cnt2 > n/3){
                    res.add(el2);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
 
    public static void main(String[] args) {
        List<Integer> res = majorityElement(new int[]{2, 2, 1, 3, 1, 1, 3, 1, 1});
        System.out.println(res);
    }
}
