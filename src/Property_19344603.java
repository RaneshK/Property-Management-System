/**
 * Student ID: 19344603 
 * Name: Ranesh Kishore 
 * Campus: Sydney City 
 * Tutor Name: Chris Stanton 
 * Class Day: Thursday 
 * Class Time: 5:30pm
 */
public class Property_19344603 {

  // Property class variables
  private int propertyID;
  private String propertyAddress;
  private double weeklyRent;
  private double managementFee;
  private int clientID;

  public Property_19344603() {
    propertyID = 0;
    propertyAddress = "";
    weeklyRent = 0;
    managementFee = 0;
    clientID = 0;
  }

  // Setter Methods

  /*
   * @param propertyID The property's unique identifier
   */
  public void setPropertyID(int propertyID) {
    this.propertyID = propertyID;
  }

  /*
   * @param propertyAddress The address of the property
   */
  public void setPropertyAddress(String propertyAddress) {
    this.propertyAddress = propertyAddress;
  }

  /*
   * @param weeklyRent The amount of the weekly rent
   */
  public void setWeeklyRent(double weeklyRent) {
    this.weeklyRent = weeklyRent;
  }

  /*
   * @param managementFee The fee claimed for management of the property
   */
  public void setManagementFee(double managementFee) {
    this.managementFee = managementFee;
  }

  /** @param clientID The ID of the client */
  public void setClientID(int clientID) {
    this.clientID = clientID;
  }

  // Getter Methods

  /*
   * @return The proprty's unique identifier
   */
  public int getPropertyID() {
    return propertyID;
  }

  /*
   * @return The address of the property
   */
  public String setPropertyAddress() {
    return propertyAddress;
  }

  /*
   * @return The amount of the weekly rent
   */
  public double getWeeklyRent() {
    return weeklyRent;
  }

  /*
   * @return The fee claimed for management of the property
   */
  public double getManagementFee() {
    return managementFee;
  }

  /*
   * @return The ID of the client
   */
  public int getClientID() {
    return clientID;
  }
}
