import java.util.Date;
public class Block {
    public String hash;
    public String previousHash;
    private String data; //our data will be a simple message.
    private long timeStamp; //as number of milliseconds since 1/1/1970.
    private int nonce;
    public Block(String previousHash, String data) {
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.data = data;
        this.hash = calculateHash(); //Making sure we do this after we set the other values.
    }
    public String calculateHash() { //Calculate new hash based on blocks contents
        return StringUtil.applySha256(previousHash + Long.toString(timeStamp) + Integer.toString(nonce) + data);
    }
    public void blockMining(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0"
        while(!hash.substring( 0, difficulty).equals(target)) {
            nonce++;
            hash = calculateHash();
        }
        System.out.println("Block Mined : " + hash);
    }
}