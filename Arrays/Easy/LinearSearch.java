public class LinearSearch {
    public static int linearSearch(int n, int num, int []arr){
        int loc=-1;
        for(int i=0;i<n;i++){
            if(arr[i] == num){
                loc=i;
                break;
            }
        }
        return loc;
    }
    public static void main(String[] args) {
        int res=linearSearch(5, 3, new int[]{1,2,0,0,3});
        System.out.println(res);
    }
}
