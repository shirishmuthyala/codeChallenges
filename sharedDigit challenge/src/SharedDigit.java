public class SharedDigit {

//    public static void main(String[] args) {
//        System.out.println(hasSharedDigit(15,55));
//    }
    public static boolean hasSharedDigit(int x, int y){
        if((x < 10 || x > 99) || (y < 10 || y > 99)){
            return false;
        }
        int samex = x;
        int samey = y;
        x = x % 10;
        int x1 = x;
        samex = samex / 10;
        int x2 = samex;
        y = y % 10;
        int y1 = y;
        samey = samey / 10;
        int y2 = samey;
        if(x1 == y1 || x1 == y2 || x2 == y1 || x2 == y2){
            return true;
        }
        return false;
    }

}
