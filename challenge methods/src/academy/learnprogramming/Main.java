package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int position = CalculateHighScorePosition(1500);
        DisplayHighScorePosition("shirish", position);

        position = CalculateHighScorePosition(900);
        DisplayHighScorePosition("gowtham", position);

        position = CalculateHighScorePosition(400);
        DisplayHighScorePosition("prajith", position);

        position = CalculateHighScorePosition(50);
        DisplayHighScorePosition("sai", position);

    }

    public static void DisplayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int CalculateHighScorePosition(int playerScore) {

        if(playerScore > 1000){
            return 1;
        } else if (playerScore > 500 && playerScore< 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        }else{
            return 4;
        }
    }
}
