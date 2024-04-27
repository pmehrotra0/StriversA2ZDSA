public class MedianTwoArray {
    public static double median(int[] a, int[] b) {
    	int n=a.length;
        int m=b.length;
        int c[] = new int[n+m];
        int i=0, j=0;
        int ind = 0;
        while(i<n && j<m){
            if(a[i] < b[j]){
                c[ind++] = a[i++];
            }
            else{
                c[ind++] = b[j++];
            }
        }
        while(i<n){
            c[ind++]=a[i++];
        }
        while(j<m){
            c[ind++]=b[j++];
        }
        if((n+m)%2 == 0){
            int r = n+m;
            return (c[r/2] + c[(r/2) -1])/2.0;
        }else{
            return c[(n+m)/2];
        }
    }
    public static double medianOpt(int[] a, int[] b) {
    	// Write your code here.
        int n=a.length;
        int m=b.length;
        int c[] = new int[n+m];
        int i=0, j=0;
        int ind = 0;
        while(i<n && j<m && ind<=(n+m)/2){
            if(a[i] < b[j]){
                c[ind++] = a[i++];
            }
            else{
                c[ind++] = b[j++];
            }
        }
        if((n+m)%2 == 0){
            return (c[ind-1] + c[ind-2])/2.0;
        }
        return c[ind-1];
    }
    public static double medianOpt1(int a[], int b[]){
        int n=a.length; int m=b.length;
        int t = n+m;
        int i=0;int j=0;
        int ind=0;
        while(ind<(t/2)-1){
            if(a[i]<b[j]){
                ind++;
                i++;
            }
            else{
                ind++;
                j++;
            }
        }
        System.out.println(ind+" "+t+" "+i+" "+j);
        if(t%2 != 0){
            return a[i] > b[j] ? a[i] : b[j];
        }
        return (a[i]+b[j])/2.0;

    }
    public static void main(String[] args) {
        System.out.println(medianOpt1(new int[]{2, 4, 6}, new int[]{1, 3, 5}));
        System.out.println(medianOpt1(new int[]{2, 4, 6}, new int[]{1, 3}));
        System.out.println(medianOpt1(new int[]{1,2,2}, new int[]{2,4,4}));
    }
}
