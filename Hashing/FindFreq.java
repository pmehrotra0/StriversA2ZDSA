/* https://www.codingninjas.com/studio/problems/k-most-occurrent-numbers_625382 */
import java.util.HashMap;
import java.util.Map;

public class FindFreq {
    public static int[] getFrequencies(int []v) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:v){
            if(map.containsKey(i)){
                int count = map.get(i);
                map.put(i, count +1);
            }
            else{
                map.put(i, 1);
            }
        }
        System.out.println(map);

        int maxCount = Integer.MIN_VALUE, minCount = Integer.MAX_VALUE;
        int maxEntry = 0, minEntry = Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> i: map.entrySet()){
            if(maxCount < i.getValue()){
                maxCount = i.getValue();
                maxEntry = i.getKey();
            }
            else if(maxCount == i.getValue()){
                maxEntry = Math.min(maxEntry, i.getKey());
            }
            if(minCount > i.getValue()){
                minCount = i.getValue();
                minEntry = i.getKey();
            }
            else if(minCount == i.getValue()){
                minEntry = Math.min(minEntry, i.getKey());
            }
            System.out.println(i.getKey() + " " + i.getValue()+ " " + minCount + " "+ maxCount + " " + minEntry + " " + maxEntry);
        }

        return new int[]{maxEntry, minEntry};
    }

    public static void main(String[] args) {
        int res[] = getFrequencies(new int[]{1,2,3,1,1,4});
        System.out.println(java.util.Arrays.toString(res));
        res = getFrequencies(new int[]{11, 13, 3, 14, 17, 3, 7, 9, 1, 11, 9, 15, 5, 2, 2, 3 });
        System.out.println(java.util.Arrays.toString(res));
    }
}
