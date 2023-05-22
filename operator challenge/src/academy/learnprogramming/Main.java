package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double FirstDouble = 20.00d;
        double SecondDouble = 80.00d;
        double TotalDouble = (FirstDouble + SecondDouble) * 100.00d;
        System.out.println("both numbers added and multiplied by 100 :" + TotalDouble);

        double Remainder = TotalDouble % 40.00;
        System.out.println("the remainder of totaldouble when divided by 40.00 is : " + Remainder);

        /*
        if(Remainder == 0){
            boolean isRemainder0 = true;
            System.out.println("The remainder is 0 :" + isRemainder0);
        }
        if(Remainder != 0){
            boolean isRemainder0 = false;
            System.out.println("The remainder is not 0 :" + isRemainder0);
        }
        */

        boolean isRemainder0 = Remainder == 0 ? true : false;
        System.out.println("isRemainder0 : " + isRemainder0);

        if(isRemainder0 == false){
            System.out.println("got some remainder ");
        }


    }
}
