/*https://www.codingninjas.com/studio/problems/sorted-array_6613259 */
import java.util.*;
public class MergeSortedArray {
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> res = new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                res.add(a[i]);
                int val=a[i];
                i++;
                while(i<a.length && val == a[i]){
                    i++;
                }
            }
            else if(a[i] > b[j]){
                res.add(b[j]);
                int val=b[j];
                j++;
                while(j<b.length && val == b[j]){
                    j++;
                }
            }
            else{
                int val=a[i];
                while(i<a.length && val == a[i]){
                    i++;
                }
                while(j<b.length && val == b[j]){
                    j++;
                }
                res.add(val);
            }
        }
        while (i<a.length) {
            if(res.get(res.size() -1) == a[i]){
                i++;
            }
            else{
                res.add(a[i++]);
            }
        }
        while(j<b.length){
            if(res.get(res.size() -1) == b[j]){
                j++;
            }
            else{
                res.add(b[j++]);
            }
        }
        return res;
    }

    public static List<Integer> union(int a[], int b[]){ //TC:O(n+m) SC:O(n+m) Simplified
        List<Integer> res = new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]){
                if(res.size() == 0 || res.get(res.size() - 1) != a[i]){
                    res.add(a[i]);
                }
                i++;
            }
            else{
                if(res.size() == 0 || res.get(res.size() - 1) != b[j]){
                    res.add(b[j]);
                }
                j++;
            }
        }
        while(i<a.length){
            if(res.get(res.size() -1) != a[i]){
                res.add(a[i]);
            }
            i++;
        }
        while(j<b.length){
            if(res.get(res.size() -1) != b[j]){
                res.add(b[j]);
            }
            j++;
        }
        return res;
    }
    
    public static List<Integer> intersection(int a[], int b[]){ //TC:O(min(n,m)) SC:O(min(n,m))
        List<Integer> res = new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
                res.add(a[i]);
                i++;j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return res;
    }

    public static void main(String args[]){
        List<Integer> res = sortedArray(new int[]{1,1,2,3,4,4,5}, new int[]{3,3,3,4,5,5,5,5,6,7,10, 10});
        System.out.println(res);
        res = union(new int[]{1,1,2,3,4,4,5}, new int[]{3,3,3,4,5,5,5,5,6,7,10, 10});
        System.out.println(res);
        res = intersection(new int[]{1,2,2,3,3,4,5,6}, new int[]{2,3,3,5,6,6,7});
        System.out.println(res);
    }
}