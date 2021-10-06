package zadania.shop;

public class Shopman {
    private String firstname;
    private String lastname;
    private int raiting;
    private String phone;
    public Shopman(String firstname, String lastname, int raiting, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.raiting = raiting;
        this.phone = phone;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getRaiting() {
        return raiting;
    }
    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Shopman [firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone + ", raiting="
                + raiting + "]";
    }
    
    
}
