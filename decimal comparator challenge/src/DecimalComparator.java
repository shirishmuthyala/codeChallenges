public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        float fRemainder = (float) (first % 1);
        float sRemainder = (float) (second % 1);
        if(fRemainder == sRemainder){
            return true;
        }else{
            return false;
        }

    }

}