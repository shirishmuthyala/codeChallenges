public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,22));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10) {
            return -1;
        }
        int GreatestDivisor = 1;
            for(int i = 1; i <= Math.min(first,second) ; i++){
                if((first % i == 0) && (second % i == 0)){
                    GreatestDivisor = i;
                }
            }
            return GreatestDivisor;
    }
}
