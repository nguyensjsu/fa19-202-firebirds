
/* 
 * Handles the score screen
 * 
 */

import greenfoot.*;

public class Score extends World {
    /**
     * Constructor for objects of class Score
     */
    public Score() {
        super(1100, 700, 1);
        showFinalScore();
    }

    /**
     * Display the appropriate message based on gamer's score
     */
    public void showFinalScore() {
        String message = " You win! Your Final Score: ";

        if (MyWorld.getHealthCounter().getValue() <= 0 && MyWorld.getScoreCounter().getValue() < 200) {
            message = " You lost, Game over! Your Final Score: ";
        }
        if (MyWorld.getHealthCounter().getValue() > 0 && MyWorld.getScoreCounter().getValue() > 200) {
            showText(message, 240, 250);
            showText(Integer.toString(MyWorld.getScoreCounter().getValue()), 480, 250);
        }

        else {
            message = " You lost, Game over! Your Final Score: ";
            showText(message, 240, 250);
        }
    }

    public void act() {
    }

}
