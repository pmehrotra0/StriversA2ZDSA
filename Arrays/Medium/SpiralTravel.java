/* https://www.codingninjas.com/studio/problems/spiral-matrix_6922069 */
public class SpiralTravel {
    public static int[] spiralMatrix(int [][]mat) {
        int n = mat.length;
        int m = mat[0].length;
        int res[] = new int[n*m];
        int left = 0, right = m-1;
        int top = 0, bottom = n-1;
        int ind = 0;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                res[ind++] = mat[top][i];
                System.out.println(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                res[ind++] = mat[i][right];
                System.out.println(mat[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    res[ind++] = mat[bottom][i];
                    System.out.println(mat[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    res[ind++] = mat[i][left];
                    System.out.println(mat[i][left]);
                }
                left++;
            }
            System.out.println("****");
        }
        return res;

    }
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 3, 5, 7},{10, 11, 16, 20},{23, 30, 34, 60}};
        for(int i=0;i<arr.length;i++){
            System.out.println(java.util.Arrays.toString(arr[i]));
        }
        int res[] = spiralMatrix(arr);
        System.out.println(java.util.Arrays.toString(res));
    }
}
