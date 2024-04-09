/* https://www.naukri.com/code360/problems/merge-two-sorted-arrays-without-extra-space_6898839 */

import java.util.*;

public class MergeSortedArray {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
       int an = a.length;
       int bn = b.length;
       int ai = 0, bi = 0;
       long c[] = new long[an+bn];
       int i = 0;
       while(ai<an && bi<bn){
        if(a[ai] < b[bi]){
            c[i++] = a[ai];
            ai++;
        }
        else{
            c[i++] = b[bi];
            bi++;
        }
       }
       while (ai<an) {
        c[i++] = a[ai++];
       }
       while(bi<bn){
        c[i++] = b[bi++];
       }
       
       ai=0; i=0; bi =0;
       while(ai<an){
        a[ai++] = c[i++];
       }
       while(bi<bn){
        b[bi++] = c[i++];
       }

       System.out.println(java.util.Arrays.toString(c));
    }
    
    public static void mergeTwoSortedArraysWithoutExtraSpacetwoPointer(long []a, long []b){
        int an = a.length;
        int bn = b.length;
        int ai = an-1, bi = 0;
        int i = 0;
        while(a[ai] > b[bi]){
            long tmp = b[bi];
            b[bi] = a[ai];
            a[ai] = tmp;
            ai--;
            bi++;
        }

        Arrays.sort(a);
        Arrays.sort(b);
     }
     
     public static void mergeTwoSortedArraysWithoutExtraSpaceGap(long []a, long []b){
        int an = a.length;
        int bn = b.length;
        int len = (an+bn);
        int gap = (len/2)+(len%2);
        while(gap>0){
            int i=0;
            int j=i+gap;

            while(j < len){
                System.out.print(java.util.Arrays.toString(a) + " "+ i + " ");
                System.out.println(java.util.Arrays.toString(b)+ " " + j+ " "+an);
                if(i<an && j>=an){
                    System.out.println("h1");
                    swap(a,b,i,j-an);
                }
                else if(i>=an){
                    System.out.println("h2");
                    swap(b,b,i-an, j-an);
                }
                else{
                    System.out.println("h3");
                    swap(a,a,i,j);
                }
                i++;
                j++;
                }
                if(gap == 1) break;
                gap = (gap/2) + (gap%2);
                System.out.println(gap);
            }
        }

        static void swap(long []a, long []b, int id1, int id2){
            if(a[id1] > b[id2]){
                long tmp = b[id2];
                b[id2] = a[id1];
                a[id1] = tmp;
            }
        }

     
     
     public static void main(String[] args) {
        long a[] = new long[]{1, 4, 5, 7};
        long b[] = new long[]{2, 3, 6};
        mergeTwoSortedArraysWithoutExtraSpaceGap(a, b);
        System.out.println(java.util.Arrays.toString(a));
        System.out.println(java.util.Arrays.toString(b));
    }
}
