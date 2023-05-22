import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        while(i <= 10){
            System.out.println("Enter number #" + i);
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();
                sum = sum + number;
                i++;
            }else{
                System.out.println("invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("the total sum is " + sum);
        scanner.close();
    }
}
