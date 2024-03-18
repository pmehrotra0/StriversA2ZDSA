public class SortArray012 {

    public static void sort(int arr[]){
        int cnt0=0, cnt1=0, cnt2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                cnt0+=1;
            }
            else if(arr[i] == 1){
                cnt1+=1;
            }
            else{
                cnt2+=1;
            }
        }
        int i=0;
        while(cnt0>0){
            cnt0--;
            arr[i++] = 0;
        }
        while(cnt1>0){
            cnt1--;
            arr[i++] = 1;
        }
        while(cnt2>0){
            cnt2--;
            arr[i++] = 2;
        }
    }

    public static void sort1(int arr[]){ //
        int left=0, right=arr.length - 1;
        int n = arr.length;
        while(left<right){
            while(left<=right && arr[left] == 0){
                left++;
            }
            while(right>=left && arr[right] != 0){
                right--;
            }
            System.out.println(java.util.Arrays.toString(arr) + " " + left+ " "+ right);
            if(left < right && (arr[left] !=0 && arr[right] == 0)){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        right = arr.length -1;
        System.out.println(left);
        while(arr[left] == 0){
            left++;
        }
        while(left<right){
            while(left<=right && arr[left] == 1){
                left++;
            }
            while(right>=left && arr[right] != 1){
                right--;
            }
            System.out.println(java.util.Arrays.toString(arr) + " " + left+ " "+ right + " "+ arr[left] + " " + arr[right]);
            if(left<right && (arr[left] !=1 && arr[right] == 1)){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    
    public static void dutchNationFlag(int arr[]){
        int n=arr.length;
        int low=0, mid=0, high=n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp=arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++; low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        // int arr[]=new int[]{2, 2, 2, 2, 0, 0, 1, 0};
        // sort1(arr);
        // System.out.println(java.util.Arrays.toString(arr));
        // arr=new int[]{1,0,0};
        // sort1(arr);
        // System.out.println(java.util.Arrays.toString(arr));
        // arr=new int[]{2,2,1,2};
        // sort1(arr);
        // System.out.println(java.util.Arrays.toString(arr));

        int arr[]=new int[]{2, 2, 2, 2, 0, 0, 1, 0};
        dutchNationFlag(arr);
        System.out.println(java.util.Arrays.toString(arr));
        arr=new int[]{1,0,0};
        dutchNationFlag(arr);
        System.out.println(java.util.Arrays.toString(arr));
        arr=new int[]{2,2,1,2};
        dutchNationFlag(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
