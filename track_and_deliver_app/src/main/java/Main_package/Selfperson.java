package Main_package;


public class Selfperson extends Customer{

    //attributes
    //same as Customer

    //constructor
    public Selfperson(String selfperson_email, String selfperson_password, int postal_code,
        int street_num, String street, String city, String country, String selfperson_name,
        String selfperson_surname, String selfperson_phone_number, Subscription_state selfperson_subscription) {
            super(selfperson_email, selfperson_password, postal_code, street_num, street, city, country,
                selfperson_name, selfperson_surname, selfperson_phone_number, selfperson_subscription);
    }

    //methods
    //same as Customer

}
