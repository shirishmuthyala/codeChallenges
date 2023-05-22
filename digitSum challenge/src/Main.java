public class Main {
    public static void main(String[] args) {

        System.out.println("the sum of the digit " + sumDigits(1107837));

    }
    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int sum = 0;
        int digit = 0;
        while(number > 0 ){
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }
}
