/* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1208261828/ */
/* https://www.codingninjas.com/studio/problems/best-time-to-buy-and-sell-stock_6194560 */
public class BudSellStock {
    public static int bestTimeToBuyAndSellStock(int []a) {
        int max = Integer.MIN_VALUE;
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(max < (a[j] - a[i])){
                    max = a[j] - a[i];
                }
            }
        }
        return max < 0 ? 0 : max;
    }
    public static int bestTimeToBuyAndSellStockOpt(int []a){
        int low = Integer.MAX_VALUE;
        int max = 0;
        int n = a.length;
        for(int i=0;i<n;i++){
            int tmp = a[i] - low;
            // int tmp2 = high - a[i];
            if(max < tmp){
                max = tmp;
            }
            // else if( max < tmp2){
            //     max = tmp2;
            // }
            if(low > a[i]){
                low = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int res = bestTimeToBuyAndSellStockOpt(new int[]{7, 1, 5, 4, 3, 6});
        System.out.println(res);
    }
}
