/* https://www.codingninjas.com/codestudio/problems/rotate-the-matrix_6825090?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf */
public class RotateMat {
    public static void rotateMatrix(int [][]mat){
        int n = mat[0].length;

        int res[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[j][n-1-i] = mat[i][j];
            }
        }
        for(int i=0;i<4;i++){
            System.out.println(java.util.Arrays.toString(res[i]));
        }
    }
    public static void rotateMatrixOpt(int [][]mat){
        int n = mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    int tmp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = tmp;
                }
            }
        }
        for(int i=0;i<4;i++){
            System.out.println(java.util.Arrays.toString(mat[i]));
        }
        for(int i=0;i<n;i++){
            int low=0, high=n-1;
            System.out.println("*****"+java.util.Arrays.toString(mat[i]));
            while(low<high){
                int tmp = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = tmp;
                low++;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotateMatrix(arr);
        System.err.println("****");
        for(int i=0;i<4;i++){
            System.out.println(java.util.Arrays.toString(arr[i]));
        }
        System.err.println("****");
        rotateMatrixOpt(arr);
        System.err.println("****");
        for(int i=0;i<4;i++){
            System.out.println(java.util.Arrays.toString(arr[i]));
        }
    }
}
