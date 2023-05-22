import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minvalue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int number;
        while(true){
            System.out.println("Enter Number : ");
             boolean isInt = scanner.hasNextInt();
             if(isInt){
                number = scanner.nextInt();
                if(minvalue > number){
                    minvalue = number;
                }
                if(maxValue < number){
                    maxValue = number;
                }
             }else{
                 System.out.println("invalid number");
                 break;
             }
             scanner.nextLine();
        }
        System.out.println("The minimum value is " + minvalue);
        System.out.println("The maximum value is " + maxValue);
        scanner.close();

    }
}
