import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class BlockChain {


    public static int difficulty = 5;
    public static ArrayList<Block> blockchain = new ArrayList<Block>();

    public static void main(String[] args) {
        //add our blocks to the blockchain ArrayList:

        blockchain.add(new Block("First block", "0"));
        System.out.println("Mining block 1 ");
        blockchain.get(0).blockMining(difficulty);

        blockchain.add(new Block("Second block",blockchain.get(blockchain.size()-1).hash));
        System.out.println("Mining block 2 ");
        blockchain.get(1).blockMining(difficulty);

        blockchain.add(new Block("Third block",blockchain.get(blockchain.size()-1).hash));
        System.out.println("Mining block 3 ");
        blockchain.get(2).blockMining(difficulty);

        System.out.println("\nBlockchain is Valid: " + validChain());

        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println("\nThe block chain: ");
        System.out.println(blockchainJson);
    }

    public static Boolean validChain() {
        Block earlierBlock;
        Block presentBlock;
        String hashTarget = new String(new char[difficulty]).replace('\0', '0');
        int i = 1;
        while(i < blockchain.size()){ //loop through blockchain to check hashes:
            earlierBlock = blockchain.get(i-1);
            presentBlock = blockchain.get(i);
            if(!presentBlock.hash.substring( 0, difficulty).equals(hashTarget)){ //check if hash is solved
                System.out.println("This block hasn't been mined");
                return false;
            }
            if(!earlierBlock.hash.equals(presentBlock.previousHash)){  //compare previous hash and registered previous hash
                System.out.println("Previous Hashes not equal");
                return false;
            }
            if(!presentBlock.hash.equals(presentBlock.calculateHash())){ //compare registered hash and calculated hash:
                System.out.println("Current Hashes is not equal");
                return false;
            }
            i++;
        }
        return true;
    }
}