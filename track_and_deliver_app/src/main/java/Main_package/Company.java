package Main_package;

public class Company extends Customer{

    //attributes
    //same as Customer and two more
    private String company_name;
    private int company_afm;

    //constructor
    public Company(String company_email, String company_password, int postal_code,
        String street_num, String street, String city, String country, 
        String company_phone_number, Subscription_state company_subscription, String company_name, int company_afm) {
            super(company_email, company_password, postal_code, street_num, street, city, country,"", "", company_phone_number, company_subscription);
            this.company_name = company_name;
            this.company_afm = company_afm;
    }
    //methods
    //same as Customer

    //setters
    public void setCompanyName(String company_name) {
        this.company_name = company_name;
    }

    public void setCompanyAfm(int company_afm) {
        this.company_afm = company_afm;
    }

    //getters

    public String getCompanyName() {
        return company_name;
    }

    public int getCompanyAfm() {
        return company_afm;
    }

    //other methods

}