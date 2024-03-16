/* https://leetcode.com/problems/max-consecutive-ones/description/ */
public class ConsecutiveOnes {
    public static int maxOnes(int a[]){ //TC:O(n) SC:(1)
        int n = a.length;
        int max = 0;
        int sum = 0;
        for(int i=0; i< n;i++){
            if(a[i] == 0 ){
                sum=0;
            }
            else{
                sum++;
            }
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int res = maxOnes(new int[]{1,1,0,1,1,1,0,0,1,1,0});
        System.out.println(res);
        res = maxOnes(new int[]{0,0,0});
        System.out.println(res);
        res = maxOnes(new int[]{1,1,1});
        System.out.println(res);
    }
}
