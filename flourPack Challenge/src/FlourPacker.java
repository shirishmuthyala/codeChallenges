public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        int bigCountKilos = bigCount * 5;
        int smallCountKilos = smallCount;
        int sum = bigCountKilos + smallCountKilos;
        if(sum < goal){
            return false;
        }
        int remainder = goal % 5;
        return remainder <= smallCount;

    }
}
