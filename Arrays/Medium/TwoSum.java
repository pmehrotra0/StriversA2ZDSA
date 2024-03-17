/* https://www.codingninjas.com/studio/problems/reading_6845742 */

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static String read(int n, int []book, int target){
        for(int i=0;i<book.length;i++){
            int s1 = book[i];
            for(int j=i+1;j<n;j++){
                if(s1+book[j] == target){
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static String readBetter(int n, int []book, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(target - book[i])){
                return "YES";
            }
            map.put(book[i], i);
        };
        return "NO";
    }

    public static String readOpt(int n, int []book, int target){
        Arrays.sort(book);
        int left=0,right=n-1;
        while(left<right){
            if(book[left] + book[right] == target){
                return "YES";
            }
            else if(book[left] + book[right] < target){
                left++;
            }
            else{
                right--;
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        String flag = read(5, new int[]{4,1,2,5,6}, 5);
        System.out.println(flag);
        flag = read(5, new int[]{4,1,2,5,6}, 50);
        System.out.println(flag);

        flag = readBetter(5, new int[]{4,1,2,5,6}, 5);
        System.out.println(flag);
        flag = readBetter(5, new int[]{4,1,2,5,6}, 50);
        System.out.println(flag);

        flag = readOpt(5, new int[]{4,1,2,5,6}, 5);
        System.out.println(flag);
        flag = readOpt(5, new int[]{4,1,2,5,6}, 50);
        System.out.println(flag);
    }
}
