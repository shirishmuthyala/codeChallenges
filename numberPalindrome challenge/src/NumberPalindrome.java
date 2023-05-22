public class NumberPalindrome {
    public static boolean isPalindrome(int number){
            int reverse = 0;
            int lastDigit = 0;
            int numberCopy = number;
            while(numberCopy != 0){
                lastDigit = numberCopy % 10;
                reverse = reverse * 10;
                reverse += lastDigit;
                numberCopy = numberCopy / 10;
            }
            if(reverse == number){
                return true;
            }
            return false;
    }
}
