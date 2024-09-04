public class numberOfDaysInMonthsCopy {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    /**
     * returns true if number is a palindrome.
     *
     * @param num the number to check
     * @return true if a palindrome. false if not
     */
    public static boolean isPalindrome(int num){
        num = Math.abs(num);

        int number = num;
        int reverse = 0;
        while(num > 0){
            int digit = num % 10;
            reverse *= 10;
            reverse += digit;

            num /= 10;
        }
        return reverse == number;

    }

}
