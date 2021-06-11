package Main_package;

import java.util.ArrayList;

public class DeliveryMan {

    //attributes
    private int delivery_man_afm;
    private String delivery_man_email;
    private String delivery_man_name;
    private String delivery_man_surname;
    private String password;
    private String phone;
    private Delivery_man_state availability_state;
    private double rating;
    private ArrayList<Package> packages_to_be_delivered;
    private ArrayList<Rating> ratings;
    //constructor
    public DeliveryMan(int delivery_man_afm, String delivery_man_email, String delivery_man_name, String delivery_man_surname,
        String password, String phone, Delivery_man_state availability_state, double rating,
        ArrayList<Package> packages_to_be_delivered, ArrayList<Rating> ratings) {
            
            this.delivery_man_afm = delivery_man_afm;
            this.delivery_man_email = delivery_man_email;
            this.delivery_man_name = delivery_man_name;
            this.delivery_man_surname = delivery_man_surname;
            this.password = password;
            this.phone = phone;
            this.availability_state = availability_state;
            this.rating = rating;
            this.packages_to_be_delivered = packages_to_be_delivered;
            this.ratings = ratings;
        }
    
    //setters
    public void setDeliveryManAfm(int delivery_man_afm) {
        this.delivery_man_afm = delivery_man_afm;
    }
    public void setDeliveryManEmail(String delivery_man_email) {
        this.delivery_man_email = delivery_man_email;
    }
    
    public void setDeliveryManName(String delivery_man_name) {
        this.delivery_man_name = delivery_man_name;
    }

    public void setDeliveryManSurname(String delivery_man_surname) {
        this.delivery_man_surname = delivery_man_surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAvailabilityState(Delivery_man_state availability_state) {
        this.availability_state = availability_state;
    }

    public void setRating(double rating) {
        this.rating = rating;
    } 

    public void setPackegesToBeDeliverd(ArrayList<Package> packages_to_be_delivered) {
        this.packages_to_be_delivered = packages_to_be_delivered;
    }

    public void setRatings(ArrayList<Rating> ratings) {
        this.ratings = ratings;
    }

    //getters
    
    public int getDeliveryManAfm() {
        return delivery_man_afm;
    }
    
    public String getDeliveryManEmail() {
        return delivery_man_email;
    }

    public String getDeliveryManName() {
        return delivery_man_name;
    }

    public String getDeliveryManSurname() {
        return delivery_man_surname;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getPhone() {
        return phone;
    }

    public Delivery_man_state getAvailabilityState() {
        return availability_state;
    }
    
    public double getRating() {
        return rating;
    }

    public ArrayList<Package> getPackegesToBeDeliverd() {
        return packages_to_be_delivered;
    }

    public ArrayList<Rating> getRatings() {
        return ratings;
    }

    //other methods
}
