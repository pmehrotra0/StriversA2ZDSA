/* https://www.codingninjas.com/studio/problems/remove-duplicates-from-sorted-array_1102307 */
public class RemoveDuplicate {
    public static int removeDuplicates(int arr[],int n) {
        int i=0, j=1;
        while(j<n){
            System.out.println(i+"*"+j);
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
                j++;
                System.out.println(i+"**"+j+" "+java.util.Arrays.toString(arr));
            }
            else{
                while(arr[i] == arr[j]){
                    j++;
                    System.out.println(i+"***"+j+" "+java.util.Arrays.toString(arr));
                }
            }
            System.out.println(i+" "+j+" "+java.util.Arrays.toString(arr));
        }
       
        
        return i+1;
    }
    public static void test() {

        int arr[] = new int[]{1, 1, 1, 2, 2, 3,3, 4, 4, 4, 5};
        int flag = removeDuplicates(arr, 11);
        System.out.println(java.util.Arrays.toString(arr));
        for(int i=0;i<flag;i++){
            System.out.println(arr[i]+ " "+ flag);
        }
    }
    public static void main(String[] args) {
        test();
    }
}
