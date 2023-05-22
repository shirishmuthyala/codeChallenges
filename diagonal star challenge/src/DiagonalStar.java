public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number){

        if(number < 5) {

            System.out.println("Invalid Value");
        } else {

            for(int row = 1; row <= number; row++){

                for(int column = 1; column <= number; column++){

                    if((row == 1) || (row == number) || (column == 1) || (column == number)) { //first and second condition

                        System.out.print("*");
                        //continue;
                    }else if(row == column) { // third condition

                        System.out.print("*");
                    } else if(column == (number - row + 1)){ //last condition

                        System.out.print("*");
                    } else {

                        System.out.print(" ");
                    }

                }

                System.out.println();
            }
        }
    }
}


