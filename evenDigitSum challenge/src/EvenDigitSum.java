public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(757));
    }

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        int numberCopy = number;
        int evenDigits = 0;
        while(numberCopy != 0){
            evenDigits = numberCopy % 10;
            if(evenDigits % 2 == 0){
                sum = sum + evenDigits;
            }
            numberCopy = numberCopy / 10;
        }
        return sum;
    }

}
