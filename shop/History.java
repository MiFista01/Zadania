package zadania.shop;

import java.util.Date;

public class History {
    Customer customer;
    Product product;
    Date given_date;
    Date return_date;
    public History(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Date getGiven_date() {
        return given_date;
    }
    public void setGiven_date(Date given_date) {
        this.given_date = given_date;
    }
    public Date getReturn_date() {
        return return_date;
    }
    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }
    @Override
    public String toString() {
        return "History [customer=" + customer + ", given_date=" + given_date + ", product=" + product
                + ", return_date=" + return_date + "]";
    }
    
    
}
