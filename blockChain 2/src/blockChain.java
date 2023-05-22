import java.util.ArrayList;
import java.util.Arrays;

public class blockChain {

    public static void main(String[] args) {

        // demonstrate a hash function
        String statement1 = "My world is perfect";
        int hashValue = statement1.hashCode();

        System.out.println("Statement = " + statement1 + " whose hash value = " + hashValue);

        // let's hash an array
        String [] list1 = {"alex", "becky", "cyril"};
        String [] list2 = {"alex", "becky", "cyril"};

        int hash1 = Arrays.hashCode(list1);
        int hash2 = Arrays.hashCode(list2);

        System.out.println("hash1 = " + hash1 + " hash 2 = " + hash2);

        //demonstrate a series of blocks in a chain
        ArrayList<Block> blockChain = new ArrayList<Block>();

        String[] initialValues = {"Shad has $700", "Miguel has $550"};
        Block firstBlock = new Block(initialValues, 0);
        blockChain.add(firstBlock);
        System.out.println("First block is " + firstBlock.toString());
        System.out.println("The block chain is " + blockChain.toString());

        //block two
        String[] ShadGivesAway = {"Shad gives $70 to Tim", "Shad gives $50 to Terry"};
        Block secondBlock = new Block(ShadGivesAway, firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println("Second block is " + secondBlock.toString());
        System.out.println("The block chain is " + blockChain.toString());

        //block three
        String[] shadGetsSomeBack = {"Tim gives $10 to Shad", "Terry gives $40 to Shad"};
        Block thirdBlock = new Block(shadGetsSomeBack, secondBlock.getBlockHash());
        blockChain.add(thirdBlock);
        System.out.println("Third block is " + thirdBlock.toString());
        System.out.println("The block chain is " + blockChain.toString());
    }
}
