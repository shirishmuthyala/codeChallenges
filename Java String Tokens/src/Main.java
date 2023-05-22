import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
//        // Write your code here.
//        String[] splits =  s.split(" ");
//        System.out.println(splits.length);
//
//        for(String a : splits){
//            if(a.contains("'")){
//
//            }
//                System.out.println(a);
//        }
//        scan.close();

         s = s.strip();

         if (s.isBlank()) {
             System.out.println(s.length());
         }
         else {
             String [] splits = s.split("[ !,?._'@+]+");
             System.out.println(splits.length);
             for (String a:splits) {
                 System.out.println(a);
             }
         }

        }
    }
}

