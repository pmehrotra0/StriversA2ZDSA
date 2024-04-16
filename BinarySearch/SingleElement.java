/* https://www.naukri.com/code360/problems/unique-element-in-sorted-array_1112654 */
import java.util.ArrayList;
import java.util.Arrays;

public class SingleElement {
    public static int singleNonDuplicateOpt(ArrayList<Integer> arr)
    {
        //    Write your code here.
        if(arr.size() == 1){
            return arr.get(0);
        }
        if(!arr.get(0).equals(arr.get(1)) ){
            return arr.get(0);
        }
        if(!arr.get(arr.size()-1).equals(arr.get(arr.size()-2))){
            return arr.get(arr.size()-1);
        }
        int low=1, high=arr.size()-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(!arr.get(mid).equals(arr.get(mid-1)) && !arr.get(mid).equals(arr.get(mid+1))){
                return arr.get(mid);
            }
            else if((arr.get(mid).equals(arr.get(mid-1)))){
                if(mid%2!=0){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else{
                if(mid%2==0){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        //    Write your code here.
        if(arr.size() == 1){
            return arr.get(0);
        }
        if(!arr.get(0).equals(arr.get(1))){
            return arr.get(0);
        }
        if(!arr.get(arr.size()-1).equals(arr.get(arr.size()-2))){
            return arr.get(arr.size()-1);
        }
        int low=1, high=arr.size()-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(!arr.get(mid).equals(arr.get(mid-1))  && !arr.get(mid).equals(arr.get(mid+1))){
                return arr.get(mid);
            }
            else if(((arr.get(mid).equals(arr.get(mid-1))) && mid%2==1) || (arr.get(mid).equals(arr.get(mid+1))  && mid%2==0)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> zrr=  new ArrayList<>(Arrays.asList(2, 2, 15, 15, 18, 18, 21, 21, 23, 23, 37, 37, 42, 47, 47, 49, 49  ));
        int res=singleNonDuplicate(zrr);
        System.out.println(res);
    }
}

