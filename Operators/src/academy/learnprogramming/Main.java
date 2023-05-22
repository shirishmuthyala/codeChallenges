package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean IsAlien = false;
        if (!IsAlien) {
            System.out.println("it is not an alien");
            System.out.println("it is an alien");
        }

        int TopScore = 100;
        if (TopScore == 100) {
            System.out.println("You got the high score");
        }

        int SecondTopScore = 80;
        if (SecondTopScore < TopScore && SecondTopScore < 100){
            System.out.println("Top score will always be on the top");
        }

        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        if(wasCar == true) {
            System.out.println("this is wasCar");
        }
    }

}
