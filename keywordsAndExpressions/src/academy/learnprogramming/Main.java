package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

         /*
        int score = 100;

        if(score == 200 || score < 699){
            System.out.println("very poor");
        } else if (score == 100 || score > 699) {
            System.out.println("very good");
        } else {
            System.out.println("get the hell & heaven out of this school");
        }
        */

         int highScore = calculateScore(true, 10000, 5, 100);
         System.out.println("your final score  " + highScore);

         int highScore2 = calculateScore(true, 800, 5, 100);
         System.out.println("your final score  " + highScore2);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;

        }
        return -1;


    }
}


