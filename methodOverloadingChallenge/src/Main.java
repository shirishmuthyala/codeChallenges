public class Main {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(10  , 10);

        calcFeetAndInchesToCentimeters(70);




    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet >= 0) && (inches >= 0 && inches <= 12)){
            double convertedInches = (feet * 12) + inches;
            double centimeters = convertedInches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches.  "
                    + feet + " feet in inches + Inches = " + convertedInches + " + "
                    + " Converting Inches in centimeters = " + convertedInches + " * 2.54 = " + centimeters );
            return centimeters;
        }else{
            return -1;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0){
            double convertedInches = inches % 12;
            int convertedFeet = (int) (inches / 12);
            double conversion = calcFeetAndInchesToCentimeters(convertedFeet, convertedInches);
            return conversion;
        }else{
            return -1;
        }
    }
}
