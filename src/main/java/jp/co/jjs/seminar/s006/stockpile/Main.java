package jp.co.jjs.seminar.s006.stockpile;

public class Main {

    public static void main(String[] args) {
        Stockpile stockpile = new Stockpile();
        stockpile.register(new Merchandise("洗剤", 800, 35));
        stockpile.register(new Merchandise("お皿", 300, 3));
        stockpile.register(new Merchandise("ノート", 100, 15));
        stockpile.register(new Food("おにぎり", 98, 10, "2013/09/10"));
        stockpile.register(new Food("お弁当", 450, 3, "2013/09/11"));
        
        stockpile.showAll();
    }
}
