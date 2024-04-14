/* https://www.naukri.com/code360/problems/binary-search_972 */
public class BinarySearch {

    public static int binarySearchIt(int num[], int target){
        int res = -1;
        int n = num.length;
        int low=0;int high=n-1;
        while(low<=high){
            int mid = (high+low)/2;
            System.out.println(mid + " "+num[mid]+" "+low+ " "+high);
            if(num[mid] == target){
                return mid;
            }
            else if(num[mid] > target){
                System.out.println("h1");
                high=mid-1;
            }
            else{
                System.out.println("h2");
                low=mid+1;
            }
        }
        return res;
    }

    public static int binarySearchRec(int num[], int target, int low, int high){
        int mid = (high+low)/2;
        if(low>high) return -1;
        if(num[mid] == target) return mid;
        else if(num[mid] > target) return binarySearchRec(num, target, low, mid-1);
        else return binarySearchRec(num, target, mid+1, high);
    }

    public static void main(String[] args) {
        System.out.println(binarySearchIt(new int[]{1, 3, 7, 9, 11, 12, 45}, 99));
        System.out.println(binarySearchRec(new int[]{1, 3, 7, 9, 11, 12, 45}, 12, 0, 6));
    }
}
