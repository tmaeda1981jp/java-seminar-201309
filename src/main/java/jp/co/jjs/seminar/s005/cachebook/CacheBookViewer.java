package jp.co.jjs.seminar.s005.cachebook;

public class CacheBookViewer {

    private final CacheBook book;
    
    public CacheBookViewer(CacheBook book) {
        this.book = book;
    }
    
    public void show(String month) {
        System.out.println(month + "月の収支");
        System.out.println("-------------------");
        for (Item item: book.getItems(month)) {
            System.out.println(item);
        }
        System.out.println("-------------------");
        System.out.printf("収支合計: %s", book.getTotalOf(month));
    }
}
