/* https://bit.ly/3SVaSig */
public class SetZeros {

    public static void setZerosOpt(int arr[][]){ //TC: O(2*N*M) SC:O(1)
        int n = arr.length;
        int m = arr[0].length;
        int col0 = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    if(j!=0)
                    arr[0][j] = 0;
                    else col0 = 0;
                }
            }
        }
        
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                arr[i][j] = arr[i][0]==0 ||  arr[0][j] == 0 ? 0 : arr[i][j]; 
            }
        }
        if(arr[0][0] == 0){
            for(int j=0;j<m;j++) arr[0][j] = 0;
        }
        if(col0 == 0){
            for(int i=0;i<n;i++) arr[i][0] = 0;
        }
    }

    public static void setZerosBetter(int arr[][]){ // TC= O((n*m) + (n*m)) ~O(n^2) SC=O(n)+O(m)
        int n = arr.length;
        int m = arr[0].length;
        int rows[] = new int[n];
        int cols[] = new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == 0){
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        System.out.println(java.util.Arrays.toString(rows));
        System.out.println(java.util.Arrays.toString(cols));

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rows[i] == 1){
                    arr[i][j] = 0;
                }
                if(cols[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void setZeros(int arr[][]){ //TC = O((n*m)(n+m) + (n*m)) ~ n^3
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){{
                if(arr[i][j] == 0){
                    System.out.println(i + " " +j);
                    for(int k=0;k<n;k++){
                        arr[k][j] = arr[k][j] != 0 ? -1 : 0;
                    }
                    for(int k=0;k<m;k++){
                        arr[i][k] = arr[i][k] != 0 ? -1 : 0;
                    }
                }
            }}
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = arr[i][j] == -1 ? 0 : arr[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = new int[][]{{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};
        int n = arr.length;
        setZeros(arr);
        for(int i=0;i<n;i++){
            System.out.println(java.util.Arrays.toString(arr[i]));
        }
        System.out.println("******");

        arr = new int[][]{{1,1,1,1},{1,0,1,1},{1,1,0,1},{1,0,0,1}};
        n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(java.util.Arrays.toString(arr[i]));
        }
        System.out.println("******");
        setZerosBetter(arr);
        System.out.println("******");
        for(int i=0;i<n;i++){
            System.out.println(java.util.Arrays.toString(arr[i]));
        }

        arr = new int[][]{{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,1,1,1}};
        n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(java.util.Arrays.toString(arr[i]));
        }
        System.out.println("******");
        setZerosOpt(arr);
        System.out.println("******");
        for(int i=0;i<n;i++){
            System.out.println(java.util.Arrays.toString(arr[i]));
        }
    }
}

/* int col0 = 1;
        // step 1: Traverse the matrix and
        // mark 1st row & col accordingly:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark i-th row:
                    matrix.get(i).set(0, 0);

                    // mark j-th column:
                    if (j != 0)
                        matrix.get(0).set(j, 0);
                    else
                        col0 = 0;
                }
            }
        }

        // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) != 0) {
                    // check for col & row:
                    if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }

        //step 3: Finally mark the 1st col & then 1st row:
        if (matrix.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }

        return matrix; */
