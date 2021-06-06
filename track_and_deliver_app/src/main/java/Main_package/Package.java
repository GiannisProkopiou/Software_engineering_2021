package Main_package;

import java.util.Date;
public class Package {
    
    //Attributes
    private int shipment_number;
    private Date estimated_delivery_date;
    private boolean take_away;
    private Date departure_date;
    private double weight;
    private String sending_company;
    private String dimensions;
    private int delivery_attempts;
    private Package_state state;
    
    //constructor
    public Package(int shipment_number, Date estimated_delivery_date, boolean take_away,
            Date departure_date, double weight, String sending_company, 
            String dimensions, int delivery_attempts, Package_state state) {

                this.shipment_number = shipment_number;
                this.estimated_delivery_date = estimated_delivery_date;
                this.take_away = take_away;
                this.departure_date = departure_date;
                this.weight = weight;
                this.sending_company = sending_company;
                this.dimensions = dimensions;
                this.delivery_attempts = delivery_attempts;
                this.state = state;
    }

    //setters
    public void setShipmentNumber(int shipment_number) {
        this.shipment_number = shipment_number;
    }

    public void setEstimatedDeliveryDate(Date estimated_delivery_date) {
        this.estimated_delivery_date = estimated_delivery_date;
    }

    public void setTakeAway(boolean take_away) {
        this.take_away = take_away;
    }

    public void setDepartureDate(Date departure_date) {
        this.departure_date = departure_date;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSendingCompany(String sending_company) {
        this.sending_company = sending_company;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public void setDeliveryAttempts(int delivery_attempts) {
        this.delivery_attempts = delivery_attempts;
    }

    public void setState(Package_state state) {
        this.state = state;
    }

    //getters

    public int getShipmentNumber() {
        return shipment_number;
    }

    public Date getEstimatedDeliveryDate() {
        return estimated_delivery_date;
    }

    public boolean getTakeAway() {
        return take_away;
    }

    public Date getDepartureDate() {
        return departure_date;
    }

    public double getWeight() {
        return weight;
    }

    public String getSendingCompany() {
        return sending_company;
    }

    public String getDimensions() {
        return dimensions;
    }

    public int getDeliveryAttempts() {
        return delivery_attempts;
    }

    public Package_state getState() {
        return state;
    }
    
    //other methods
}
