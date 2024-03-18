
public class MajorityElement {

    public static int majority(int arr[]){  //Moore Voting Algo TC:O(n) SC:O(1) //assuming element>n/2
        int n = arr.length;
        int el = 0, elCnt = 0;
        for(int i=0;i<n;i++){
            if(elCnt == 0){
                el = arr[i];
                elCnt++;
            }
            else{
                if(el == arr[i]){
                    elCnt++;
                }
                else{
                    elCnt--;
                }
            }
        }
        return el;
    }

    public static void main(String[] args) {
        int res = majority(new int[]{7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5});
        System.out.println(res);
    }
}
