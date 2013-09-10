package jp.co.jjs.seminar.s006.stockpile;

import java.util.*;

public class Stockpile {

    private ArrayList<Merchandise> list = new ArrayList<>();

    public void register(Merchandise merchandise) {
        this.list.add(merchandise);
    }

    public void showAll() {
        for (Merchandise merchandise: list) {
            merchandise.showDetail();
        }
    }
}
