public class EqualSumChecker {
    public static boolean hasEqualSum(int x,int y, int z){
        int sum =  x +  y;

        if(sum == z){
            return true;
        }else{
            return false;
        }
    }


}