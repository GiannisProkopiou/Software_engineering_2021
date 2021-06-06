
package Main_package;


public class Rating {
    
    //attributes
    private Customer customer_rated;    //customer who rated delivery man
    private String comments;            //customer's comments
    private double star_rating;         //star rating 1 to 5
    
    //constructor
    public Rating(Customer customer_rated, String comments, double star_rating) {
        
        this.customer_rated = customer_rated;
        this.comments = comments;
        this.star_rating = star_rating;
    }
    
    //setters
    public void setCustomerRated(Customer customer_rated) {
        this.customer_rated = customer_rated;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setStarRating(double star_rating) {
        this.star_rating = star_rating;
    }

    //getters
    public Customer getCustomerRated() {
        return customer_rated;
    }

    public String getComments() {
        return comments;
    }

    public double getStarRating() {
        return star_rating;
    }

    //other
    //commit will insert a Rating objet to the DB
    public void commit(){}
}
