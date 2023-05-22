public class NumberToWords {


    public static void numberToWords(int number){
        if(number == 0){
        System.out.println("Zero");
        }
        if (number < 0) {
            System.out.println("Invalid value");
        }
        int digitCount = getDigitCount(number);
        int reverseNumberCount = reverse(number);
        int reverseDigitCount = getDigitCount(reverseNumberCount);
        int lastDigit = 0;
        while(reverseNumberCount > 0) {
            lastDigit = reverseNumberCount % 10;
            if (lastDigit == 0) {
                System.out.println("Zero");
            } else if (lastDigit == 1) {
                System.out.println("One");
            } else if (lastDigit == 2) {
                System.out.println("Two");
            } else if (lastDigit == 3) {
                System.out.println("Three");
            } else if (lastDigit == 4) {
                System.out.println("Four");
            } else if (lastDigit == 5) {
                System.out.println("Five");
            } else if (lastDigit == 6) {
                System.out.println("Six");
            } else if (lastDigit == 7) {
                System.out.println("Seven");
            } else if (lastDigit == 8) {
                System.out.println("Eight");
            } else {
                System.out.println("Nine");
            }
            reverseNumberCount = reverseNumberCount / 10;
        }
        if(digitCount != reverseDigitCount){
            for(int i = reverseDigitCount; i < digitCount; i++ ){
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number){
        int reverse = 0;
        int lastDigit = 0;
        while(number != 0 ){
            lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if(number > 0){
            int count = 0;
            int numberCopy = number;
            while(number > 0){
                numberCopy = number % 10;
                count++;
                number = number / 10;
            }
            return count;
        }
        if(number == 0){
            return 1;
        }
        return -1;
    }
}
