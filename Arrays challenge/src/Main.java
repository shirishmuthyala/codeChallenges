import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
       int[] unsortedArray = RandomNumbersGenerator(5);
       System.out.println(Arrays.toString(unsortedArray));
       int[] sortedArray = DescendingArray(unsortedArray);
       System.out.println(Arrays.toString(sortedArray));

    }

    private static int[] RandomNumbersGenerator(int length){
        Random random = new Random();
        int[] firstArray = new int[length];
        for(int i = 0; i < length; i++){
            firstArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        return firstArray;
    }

    private static int[] DescendingArray(int[] unsortedArray ){
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < unsortedArray.length - 1; i++){
                if(unsortedArray[i] < unsortedArray[i+1]){
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i+1];
                    unsortedArray[i+1] = temp;
                    flag = true;
                }

            }
        }
        return unsortedArray;
    }

}

