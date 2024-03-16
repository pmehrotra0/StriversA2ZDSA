/* https://www.codingninjas.com/studio/problems/find-the-single-element_6680465 */
public class SingleElement { 
    public static int getSingleElement(int []arr){ //need sorted 
        int i=0;
        int n=arr.length;
        while(i<n){
            if(i+1 < n && arr[i] == arr[i+1]){
                i+=2;
                continue;
            }
            else{
                break;
            }
        }
        return i<n ? arr[i] : -1;
    }
    public static int getSingle(int []a){
        int xor=0;
        int n = a.length;
        for(int i=0;i<n;i++){
            xor = xor^a[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int res = getSingleElement(new int[]{1,1,2,2,3,3,4,4,5,5});
        System.out.println(res);
        res = getSingle(new int[]{1,1,2,2,3,3,4,4,5});
        System.out.println(res);
    }
}
