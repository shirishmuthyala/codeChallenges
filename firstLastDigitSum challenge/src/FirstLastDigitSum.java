public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int firstDigit = 0, lastDigit = 0, sum = 0;
        lastDigit = number % 10;
        while(number >= 10){
            number = number / 10;
        }
        firstDigit = number;
        sum = firstDigit + lastDigit;
        return sum;
    }

}
