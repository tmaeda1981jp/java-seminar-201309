package jp.co.jjs.seminar.s009.janken.tactics;

import jp.co.jjs.seminar.s009.janken.hands.*;

public class RandomTactics implements Tactics {
    
    private static final Stone STONE = new Stone();
    private static final Paper PAPER = new Paper();
    private static final Scissors SCISSORS = new Scissors();

    @Override
    public HandComparable readTactics() {
        HandComparable result;
        double rand = Math.random() * 3;
        if (rand < 1) {
            result = STONE;
        }
        else if (rand < 2) {
            result = PAPER;
        }
        else {
            result = SCISSORS;
        }
        return result;
    }

}
