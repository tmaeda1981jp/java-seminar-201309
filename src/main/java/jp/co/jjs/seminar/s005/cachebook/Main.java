package jp.co.jjs.seminar.s005.cachebook;

public class Main {

    public static void main(String[] args) {
        CacheBook book = new CacheBook();
        book.add(new Item(5000, "お小遣い", "20130701"));
        book.add(new Item(5000, "お小遣い", "20130801"));
        book.add(new Item(-200, "お菓子",   "20130803"));
        book.add(new Item(-1000, "CD",     "20130811"));
        book.add(new Item(10000, "おばあちゃんからのお小遣い",  "20130820"));

        CacheBookViewer viewer = new CacheBookViewer(book);
        viewer.show("201308");
    }
}
