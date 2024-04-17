
public class FindSqrt {
    public static int sqrtN(long N) {
		int low=0, high=(int)(N-1);
        if(N <= 0){
            return 0;
        }
        while(low<=high){
            int mid = (low+high)/2;
            int sq = mid*mid;
            System.out.println(low+ " " + high+ " "+mid + " "+ sq);
            if(sq==N){
                return mid;
            }
            else if(sq > N){
                high = mid-1;
            }
            else{
                low= mid+1;
            }
        }
        return low-1;
	}
    public static void main(String[] args) {
        System.out.println(sqrtN(1));
    }
}
