package jp.co.jjs.seminar.s009.janken.tactics;

import jp.co.jjs.seminar.s009.janken.hands.*;

public class OnlyStoneTactics implements Tactics {

    private static final Stone STONE = new Stone();
    
    @Override
    public HandComparable readTactics() {
        return STONE;
    }

}
