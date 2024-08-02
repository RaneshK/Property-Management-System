/**
 * Student ID: 19344603 
 * Name: Ranesh Kishore 
 * Campus: Sydney City 
 * Tutor Name: Chris Stanton 
 * Class Day: Thursday 
 * Class Time: 5:30pm
 */
public class Rent_19344603 {

  // Rent class variables
  private int propertyID;
  private double rentAmount;

  public Rent_19344603() {
    propertyID = 0;
    rentAmount = 0;
  }

  // Getter Methods
  /** @return The amount of rent */
  public double getRentAmount() {
    return rentAmount;
  }

  public int getProprtyID() {
    return propertyID;
  }

  // Setter Methods
  /*
   * @param rentAmount The amount of rent
   */
  public void setRentAmount(double rentAmount) {
    this.rentAmount = rentAmount;
  }

  /*
   * @param propertyID The Unique Identifier for each property
   */
  public void setPropertyID(int propertyID) {
    this.propertyID = propertyID;
  }
}
