package zadania.shop;

import java.util.Date;

public class Product {
    private String name;
    private String teg;
    private Date start;
    private Date finish;
    private  Shopman shopman;
    
    public Product(String name, String teg, Shopman shopman) {
        this.name = name;
        this.teg = teg;
        this.shopman = shopman;
    }
    
    public Shopman getShopman() {
        return shopman;
    }

    public void setShopman(Shopman shopman) {
        this.shopman = shopman;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTeg() {
        return teg;
    }
    public void setTeg(String teg) {
        this.teg = teg;
    }
    public Date getStart() {
        return start;
    }
    public void setStart(Date start) {
        this.start = start;
    }
    public Date getFinish() {
        return finish;
    }
    public void setFinish(Date finish) {
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "Product [finish=" + finish + ", name=" + name + ", shopman=" + shopman + ", start=" + start + ", teg="
                + teg + "]";
    }
    
}
