/**
 * Student ID: 19344603 
 * Name: Ranesh Kishore 
 * Campus: Sydney City 
 * Tutor Name: Chris Stanton 
 * Class Day: Thursday 
 * Class Time: 5:30pm
 */
public class Expense_19344603 {

  // Expense class variables
  private int propertyID;
  private String expenseDescription;
  private double expenseAmount;

  // Date

  public Expense_19344603() {
    propertyID = 0;
    expenseDescription = "Empty";
    expenseAmount = 0;
  }

  // Setter Methods

  /*
   * @param expenseDescription This provides a description of the expense
   */
  public void setExpenseDescription(String expenseDescription) {
    this.expenseDescription = expenseDescription;
  }

  /*
   * @param expenseAmount This is the amount of the expense
   */
  public void setExpenseAmount(double expenseAmount) {
    this.expenseAmount = expenseAmount;
  }

  /*
   * @param clientID The property's ID \
   */
  public void setPropertyID(int propertyID) {
    this.propertyID = propertyID;
  }

  // Getter Methods

  /*
   * @return The description of the expense
   */
  public String getExpenseDescription() {
    return expenseDescription;
  }

  /*
   * @return The amount of the expense
   */
  public double getExpenseAmount() {
    return expenseAmount;
  }

  /*
   * @return The property's ID
   */
  public int getPropertyID() {
    return propertyID;
  }
}
