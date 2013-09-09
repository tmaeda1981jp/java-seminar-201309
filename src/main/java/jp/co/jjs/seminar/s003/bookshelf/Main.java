package jp.co.jjs.seminar.s003.bookshelf;

public class Main {

    public static void main(String[] args) {
        BookShelf bookshelf = new BookShelf();
        bookshelf.add(new Book("978-4-87311-635-8", "テスタブルJavaSacript", 3150, "2013/09/21"));
        bookshelf.add(new Book("978-4-87311-631-0", "オープンデザイン", 3780, "2013/08/24"));
        bookshelf.add(new Book("978-4-87311-634-1", "入門 データ構造とアルゴリズム", 3990, "2013/08/24"));
        bookshelf.add(new Book("978-4-87311-622-8", "ゲームクリエイターが知るべき97のこと 2", 1995, "2013/08/23"));
        bookshelf.add(new Book("978-4-87311-628-0", "続・初めてのPerl 改訂第2版", 3780, "2013/08/21"));
        bookshelf.add(new Book("978-4-87311-633-4", "初めてのPHP、MySQL、JavaScript＆CSS 第2版", 3780, "2013/08/21"));
        bookshelf.add(new Book("978-4-87311-620-4", "「タッチパネル」のゲームデザイン", 2940, "2013/08/17"));
        System.out.printf("現在%d冊の書籍が登録されています。\n", bookshelf.size());
        
        bookshelf.remove("978-4-87311-635-8");
        bookshelf.remove("978-4-87311-620-4");
        System.out.printf("現在%d冊の書籍が登録されています。\n", bookshelf.size());

        for (Book book: bookshelf.list()) {
            System.out.println(book.toString());
        }
    }
}
