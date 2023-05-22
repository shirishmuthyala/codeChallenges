package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        String LastString = "10";
        int MyInt = 50;
        LastString = LastString + MyInt;
        System.out.println("my string is " +  LastString);
        //string is immutable, that means once iit is created it cant be changed, we can just create a new one, ex,
        //LastString can be created once again and the previous values will be added. LastString = LastString + Any other value.
    }
}
