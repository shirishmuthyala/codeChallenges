import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Available options: " + '\n'+
                "0 - to shutdown" + '\n'+
                "1 - to add item(s) to list (comma delimited list)" + '\n'+
                "2 - to remove any items (comma delimited list )");
        System.out.println("Enter a number  for which  action you want to do: ");

        Scanner scanner = new Scanner(System.in);
        int Input = scanner.nextInt();
        if(Input == 0){
            System.out.println("Exiting....");
            scanner.close();
        } else if (Input == 1) {
            System.out.println("Add Items separated by comma's" );
            scanner.nextLine();
            String Items = scanner.nextLine();
            String[] arrayItems = Items.split(",");
            var groceryList = Arrays.asList(arrayItems);
            System.out.println(groceryList);
        } else if (Input == 2) {

        }else{
            System.out.println("Enter correct number ");
        }


    }

}
