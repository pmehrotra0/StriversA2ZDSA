/* https://www.naukri.com/code360/problems/nth-root-of-m_1062679 */
public class FindNthRoot {
    public static int NthRoot(int n, int m) {
        int low=1, high=m;
        while(low<=high){
            int mid = (low+high)/2;
            double npower = Math.pow(mid, n);
            if(npower == m){
                return mid;
            }
            else if(npower>m){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(NthRoot(3, 27));
    }
}
