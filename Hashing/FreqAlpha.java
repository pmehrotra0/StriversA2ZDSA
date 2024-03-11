public class FreqAlpha {

    public static int[] getFrequency(String str, char list[]){ /* only for lower case char */
        int hash[] = new int[26];
        int n = list.length;
        int res[] = new int[n];

        for(char ch: str.toCharArray()){
            hash[ch - 'a'] += 1;
        }

        System.out.println(java.util.Arrays.toString(hash));

        for(int i=0;i<n;i++){
            res[i] = hash[list[i] - 'a'];
        }

        return res;
    }

    public static void main(String[] args) {
        int res[] = getFrequency("abcdabehf", new char[]{'a', 'g', 'h', 'b', 'c'});
        System.out.println(java.util.Arrays.toString(res));
    }
}
