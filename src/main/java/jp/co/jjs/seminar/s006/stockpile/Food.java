package jp.co.jjs.seminar.s006.stockpile;

public class Food extends Merchandise {

    private String expirationDate;
    
    public Food(String name, int price, int count, String expirationDate) {
        super(name, price, count);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    protected void showDetail() {
        System.out.printf("商品名: %s 価格 %d 在庫 %d 賞味期限 %s\n", name, price, count, expirationDate);
    }
}
