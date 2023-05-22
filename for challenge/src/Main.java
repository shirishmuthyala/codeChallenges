public class Main {
    public static void main(String[] args) {

        for(int i = 8; i >1; i--){
            System.out.println("the interest rate of " + i + " for amount 10000 is " +
                    String.format("%2f", calculateInterest(10000, i)));
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}

