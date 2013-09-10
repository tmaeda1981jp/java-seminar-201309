package jp.co.jjs.seminar.s009.janken;

import jp.co.jjs.seminar.s009.janken.hands.*;
import jp.co.jjs.seminar.s009.janken.tactics.*;

public class Player {

    private Tactics tactics;
    
    private String name;
    
    public Player(String name) {
        this.name = name;
    }
    
    void setTactics(Tactics tactics) {
        this.tactics = tactics;
    }
    
    public HandComparable showHand() {
        return this.tactics.readTactics();
    }
    
    public String getName() {
        return this.name;
    }
}
