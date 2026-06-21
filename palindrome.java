public class palindrome {
    public static void main(String[] args) {
        int x = 121;

        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int angkaAwal = x;
        int angkaBalik = 0;
        while (x != 0) {
            int digit = x % 10;
            angkaBalik = angkaBalik * 10 + digit;
            x = x / 10;
        }
        if (angkaAwal == angkaBalik) {
            return true;
        } else {
            return false;
        }
    }
}