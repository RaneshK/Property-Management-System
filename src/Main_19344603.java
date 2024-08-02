/**
 * Student ID: 19344603 
 * Name: Ranesh Kishore 
 * Campus: Sydney City 
 * Tutor Name: Chris Stanton 
 * Class Day: Thursday 
 * Class Time: 5:30pm
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main_19344603 {

  public static void main(String[] args) throws FileNotFoundException {
    // TODO Auto-generated method stub
    Scanner kb = new Scanner(System.in);
    int userSelection = 0;
    int weeksOfRent = 0;
    int totalRent = 0;
    String search = "";
    String decision = "";
    String formating = "%1s %5s %1s %20s %1s %20s %1s %20s %1s %20s %1s %20s %1s %20s %n";

    printMenu();
    userSelection = kb.nextInt();

    if (userSelection < 1 || userSelection > 5) {
      printMenu();
    } else if (userSelection == 1) {
      // Record Rent Collection

      // Allow the user to find the property for which the rent was collected
      //    		if (clients.getPropertAddress().contains(search)) {
      //                 Display the properties 
      //    		}

      // Ask the user how many weeks of rent was collected
      System.out.println("How many weeks of rent was collected? ");
      weeksOfRent = kb.nextInt();
         

      // Display the menu again after all processes have completed
      printMenu();
      userSelection = kb.nextInt();
      // Calculate the amount of rent collected

    } else if (userSelection == 2) {
      // Record Expense

      // Display the menu again after all processes have completed
      printMenu();
      userSelection = kb.nextInt();
    } else if (userSelection == 3) {
      // Portfolio Report
      // Ask the user if the report is for all clients or for a specific client
      System.out.println("Generate report for all users ?");
      System.out.println("Please enter yes or no");
      // Yes
      decision = kb.next();

      if (decision.contains("y")) {
        // Print report for all clients

        // Display the menu again after all processes have completed
        printMenu();
        userSelection = kb.nextInt();
      }
      // no
      else if (decision.contains("n")) {
        // Search for specific client

        // Display the menu again after all processes have completed
        printMenu();
        userSelection = kb.nextInt();
      }

    } else if (userSelection == 4) {
      // Save

      // Display the menu again after all processes have completed
      printMenu();
      userSelection = kb.nextInt();
    } else if (userSelection == 5) {
      // End the program
      System.out.println("The program will now end");
    }

    // Opens the file with the specified path
    File clientFile = new File("clients.txt");
    @SuppressWarnings("resource")
    Scanner cInputFile = new Scanner(clientFile).useDelimiter(",");

    // Create and instantiate the client objects
    Client_19344603[] clients = new Client_19344603[10];
    for (int i = 0; i < clients.length; i++) {
      clients[i] = new Client_19344603();

      // Check if the file exists in the specified path
      if (clientFile.exists()) {

        // Add the appropriate values to to the appropriate client object
        while (cInputFile.hasNext()) {
          clients[i].setClientID(cInputFile.nextInt());
          clients[i].setClientName(cInputFile.next());
          clients[i].setAddress(cInputFile.next());
        }
      }
    }

    File propertyFile = new File("properties.txt");
    Scanner pInputFile = new Scanner(propertyFile);

    // Create and instantiate the property objects
    Property_19344603[] properties = new Property_19344603[10];
    for (int i = 0; i < clients.length; i++) {
      properties[i] = new Property_19344603();

      // Check if the file exists in the specified path
      if (propertyFile.exists()) {

        while (pInputFile.hasNext()) {

          // Add the appropriate values to to the appropriate property object
          properties[i].setPropertyID(pInputFile.nextInt());
          properties[i].setPropertyAddress(pInputFile.next());
          properties[i].setWeeklyRent(pInputFile.nextFloat());
          properties[i].setManagementFee(pInputFile.nextFloat());
          properties[i].setClientID(pInputFile.nextInt());
        }
      }
    }

    File expenseFile = new File("expenses.txt");
    Scanner eInputFile = new Scanner(expenseFile);

    // Create and instantiate the expense objects
    Expense_19344603[] expenses = new Expense_19344603[10];
    for (int i = 0; i < expenses.length; i++) {
      expenses[i] = new Expense_19344603();

      // Check if the file exists in the specified path
      if (expenseFile.exists()) {

        while (eInputFile.hasNext()) {

          expenses[i].setPropertyID(eInputFile.nextInt());
          expenses[i].setExpenseDescription(eInputFile.next());
          expenses[i].setExpenseAmount(eInputFile.nextFloat());
        }
      }
    }

    File rentFile = new File("rent.txt");
    Scanner rInputFile = new Scanner(rentFile);

    // Create and instantiate the rent objects
    Rent_19344603[] rents = new Rent_19344603[10];
    for (int i = 0; i < rents.length; i++) {
      rents[i] = new Rent_19344603();

      // Check if the file exists in the specified path
      if (rentFile.exists()) {

        while (rInputFile.hasNext()) {
          rents[i].setPropertyID(rInputFile.nextInt());
          rents[i].setRentAmount(rInputFile.nextFloat());
        }
      }
    }
  }
  /*
   * The method creates the menu 
   */
  public static void printMenu() {

    System.out.println("1. Record Rent Collection");
    System.out.println("2. Record Expense");
    System.out.println("3. Generate Portfolio Report");
    System.out.println("4. Save");
    System.out.println("5. Exit Program");
  }
}
