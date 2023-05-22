package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("shirish", 500);
        System.out.println("players new score is " + newScore);
        calculateScore(100);
    }


    public static int calculateScore(String playerName, int score) {
        System.out.println("Player is " + playerName + " Score is " + score);
        return score * 1000;
    }
    public static int calculateScore( int score) {
        System.out.println("Player is Score is " + score);
    }
}
