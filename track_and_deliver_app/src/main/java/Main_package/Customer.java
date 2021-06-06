
package Main_package;

//General user
//Company and selperson extends Customer
public class Customer {
    
    //attributes
    private String customer_email;
    private String customer_password;
    private int postal_code;
    private int street_num;
    private String street;
    private String city;
    private String country;
    private final String customer_name;
    private final String customer_surname;
    private String customer_phone_number;
    private Subscription_state customer_subscription;
    
    //constructor
    public Customer(String customer_email, String customer_password, int postal_code, 
            int street_num, String street, String city, String country, String customer_name,
            String customer_surname, String customer_phone_number, Subscription_state customer_subscription) {

                this.customer_email = customer_email;
                this.customer_password = customer_password;
                this.postal_code = postal_code;
                this.street_num = street_num;
                this.street = street;
                this.city = city;
                this.country = country;
                this.customer_name = customer_name;
                this.customer_surname = customer_surname;
                this.customer_phone_number = customer_phone_number;
                this.customer_subscription = customer_subscription;
    }
   
    //setters
    public void setCustomerEmail(String customer_email) {
        this.customer_email = customer_email;
    }
    
    public void setCustomerPassword(String customer_password) {
        this.customer_password = customer_password;
    }

    public void setPostalCode(int postal_code) {
        this.postal_code = postal_code;
    }

    public void setStreetNum(int street_num) {
        this.street_num = street_num;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //no setters for name and surname..

    public void setCustomerPhoneNumber(String customer_phone_number) {
        this.customer_phone_number = customer_phone_number;
    }

    public void setCustomerSubscription(Subscription_state customer_subscription) {
        this.customer_subscription = customer_subscription;
    }

     
    //getters
    public String getCustomerEmail() {
        return customer_email;
    }

    public String getCustomerPassword() {
        return customer_password;
    }

    public int getPostalCode() {
        return postal_code;
    }

    public int getStreetNum() {
        return street_num;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getCustomerName() {
        return customer_name;
    }

    public String getCustomerSurname() {
        return customer_surname;
    }

    public String getCustomerPhoneNumber() {
        return customer_phone_number;
    }

    public Subscription_state getCustomerSubscription() {
        return customer_subscription;
    }
    
    //other methods
    



}
