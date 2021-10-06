package zadania.shop;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class App {
    public void run(){
        Shopman shopman1 = new Shopman("Andrei", "Kukuruzov", 5, "56892314");
        Shopman shopman2 = new Shopman("Aleksei", "Seltsiv", 1, "56457825");


        Customer customer1 = new Customer("Petja", "Visarionov", "56897412");
        Customer customer2 = new Customer("Andrei", "Pechka", "56124875");


        Calendar c = new GregorianCalendar();
        Product product1 = new Product("banans", "food",shopman1);
        product1.setStart(c.getTime());
        c = new GregorianCalendar();
        product1.setFinish(c.getTime());

        c = new GregorianCalendar();
        Product product2 = new Product("samsung s6", "phone",shopman2);
        product2.setStart(c.getTime());


        c = new GregorianCalendar();
        History history1 = new History(customer1, product1);
        history1.setGiven_date(c.getTime());
        System.out.println(history1.toString());

        c = new GregorianCalendar();
        History history2 = new History(customer2, product2);
        history2.setGiven_date(c.getTime());
        System.out.println(history2.toString());


    }
}
