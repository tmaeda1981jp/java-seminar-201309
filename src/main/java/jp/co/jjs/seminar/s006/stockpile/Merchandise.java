package jp.co.jjs.seminar.s006.stockpile;

public class Merchandise {

    protected String name;
    protected int price;
    protected int count;
    
    public Merchandise(String name, int price, int count) {
        this.name  = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    protected void showDetail() {
        System.out.printf("商品名: %s 価格 %d 在庫 %d\n", name, price, count);
    }
}
