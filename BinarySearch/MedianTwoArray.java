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
    
    public static double medianBS(int a[], int b[]){
        int n=a.length;
        int m=b.length;
        int t = n+m;
        int low=0;
        System.out.println(low +" ----");
        int ans = 0;
        int high=n-1;
        while(low<=high){
            int i = (low+high)/2;
            int left=(t/2) - i;
            System.out.println("picked: "+i +" "+left);
            if(i==0){
                // System.out.println("compared: "+b[left-1] +" "+a[i]);
                if(left < m && b[left-1] <= a[i]){
                    // System.out.println("12w3212321");
                    ans = i;
                    high = i-1;
                    break;
                }
                else{
                    low=i+1;
                }
            }
            else if(left == 0 ){
                // System.out.println("compared: "+a[i-1] +" "+b[left]);
                if(a[i-1] <= b[left]){
                    ans =i;
                    high = i-1;
                    break;
                }
                else{
                    low=i+1;
                }
            }
            else{
                System.out.println("compared: "+a[i-1] +" "+b[left]+" && " + b[left-1] +" " + a[i]);
                if( left<m && a[i-1] <= b[left]  && b[left-1] <= a[i]){
                    // System.out.println("12321");
                    ans = i;
                    high = i-1;
                    break;
                }
                else{
                    low=i+1;
                }
            }
        }
        int left = (t/2) - ans;
        if(t%2==0){
            int med = a[ans] < b[left] ? a[ans] : b[left];
            med += a[ans-1] > b[left-1] ? a[ans-1] : b[left-1];
            return med/2.0;
        }
        else{
            return a[ans] < b[left] ? a[ans] : b[left];
        }
        // System.out.println("ans="+ans +" "+left);
        // System.out.println("ans="+a[ans] +" "+b[left-1]);
        // return 0;
    }
    public static void main(String[] args) {
        System.out.println(medianBS(new int[]{2, 4, 6}, new int[]{1, 3, 5}));
        System.out.println(medianBS(new int[]{2, 4, 6}, new int[]{1, 3}));
        System.out.println(medianBS(new int[]{1,2,2}, new int[]{2,4,4}));
        System.out.println(medianBS(new int[]{1, 1, 5, 11, 12, 12, 14, 14, 16, 17 }, new int[]{11, 15, 20, 20, 20, 20 }));

    }
}
