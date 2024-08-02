/**
 * Student ID: 19344603 
 * Name: Ranesh Kishore 
 * Campus: Sydney City 
 * Tutor Name: Chris Stanton 
 * Class Day: Thursday 
 * Class Time: 5:30pm
 */
public class Client_19344603 {

  // Client class variables
  private int clientID;
  private String firstName;
  private String surname;
  private String address;
  private String name;

  public Client_19344603() {
    clientID = 0;
    firstName = "";
    surname = "";
    address = "";
    name = "";
  }

  // Setter Methods

  /*
   *  @param clientID The client's ID number
   */
  public void setClientID(int clientID) {
    this.clientID = clientID;
  }

  /*
   * @param firstName The first name of the client
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /*
   * @param surname The client's lastname (surname)
   */
  public void setSurname(String surname) {
    this.surname = surname;
  }

  /*
   * @param address The address where correspondence is to be mailed
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /*
   * @param name The clients name as a whole (first and last name together)
   */
  public void setClientName(String name) {
    this.firstName = name;
    // This needs to be separated later
    // i.e first name put into the firstName variable and last name put into the lastName variable
  }

  // Getter Methods

  /*
   * @return The client's ID number
   */
  public int getClientID() {
    return clientID;
  }

  /*
   * @return The client's first name
   */
  public String getFirstName() {
    return firstName;
  }

  /*
   * @return The client's last name (surname)
   */
  public String getSurname() {
    return surname;
  }

  /*
   * @return The Client's mailing address
   */
  public String getAddress() {
    return address;
  }

  /*
   * @return The client's whole name (e.g Ranesh Kishore)
   */
  public String getClientName() {
    return name;
  }
}
