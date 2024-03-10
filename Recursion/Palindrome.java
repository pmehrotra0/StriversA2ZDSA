public class Palindrome {
    public static boolean pal(int low, int high, String str){
        if(low<high){
            if(str.charAt(low) != str.charAt(high)){
                return false;
            }
            return pal(low+1, high-1, str);
        }
        return true;
    }
    public static boolean isPalindrome(String str) {
        return pal(0, str.length()-1, str);
    }
    public static void main(String[] args) {
        boolean flag = isPalindrome("abba");
        System.out.println(flag);
        flag = isPalindrome("ababa");
        System.out.println(flag);
        flag = isPalindrome("abccdba");
        System.out.println(flag);
    }
}
