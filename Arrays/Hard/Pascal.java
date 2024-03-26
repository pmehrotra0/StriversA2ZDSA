/* https://www.codingninjas.com/studio/problems/print-pascal-s-triangle_6917910 */
public class Pascal {
    public static int[] generateRow(int n){
        int ans = 1;
        int ind = 0;
        int res[]=new int[n];
        res[ind++] = ans;

        for (int col = 1; col < n; col++) {
            ans = ans * (n - col);
            ans = ans / col;
            res[ind++] = ans;
        }
        return res;

    }
    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int res[][] = new int[N][N];
        int ind = 0;
        //store the entire pascal's triangle:
        for (int row = 1; row <= N; row++) {
            res[ind++] = generateRow(row);
        }
        return res;
    }

    public static void main(String[] args) {
        int res[][] = pascalTriangle(6);
        for(int i=0;i<6;i++){
            System.out.println(java.util.Arrays.toString(res[i]));
        }
    }

}
