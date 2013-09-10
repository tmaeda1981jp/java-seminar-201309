package jp.co.jjs.seminar.s005.cachebook;

public class CacheBookViewer {

    private final CacheBook book;
    
    public CacheBookViewer(CacheBook book) {
        this.book = book;
    }
    
    public void show(String month) {
        System.out.printf("%s年%s月の収支\n", month.substring(0, 4), month.substring(4, 6));
        System.out.println("-------------------");
        for (Item item: book.getItems(month)) {
            System.out.println(item);
        }
        System.out.println("-------------------");
        System.out.printf("収支合計: %s", book.getTotalOf(month));
    }
}
