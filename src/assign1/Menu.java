package assign1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	
	

	
	Client standard1 = new Standard(1, "Pink Floyd", 200);
	Client loyalty1 = new Loyalty(2, "Raj Sitoula", 200);
	Client employee1 = new Employee(3, "John Lenon", 150);
	ArrayList<Standard> standardClient = new ArrayList<Standard>();
	ArrayList<Loyalty> loyaltyClient = new ArrayList<Loyalty>();
	ArrayList<Employee> employeeClient = new ArrayList<Employee>();
	ArrayList<Client> clientarray = new ArrayList<>();
	
	private void hardCodedInfo() {
		standardClient.add((Standard) standard1);
		loyaltyClient.add((Loyalty) loyalty1);
		employeeClient.add((Employee) employee1);
		clientarray.addAll(standardClient);
		clientarray.addAll(loyaltyClient);
		clientarray.addAll(employeeClient);
	}
	
	public void displayUserMenu() {
		// Control the menu navigation.  Includes display of menu, acceptance and processing of user input and
		// exiting the menu based on the user's selections.
		boolean blnContinue = true;
		Scanner scanInput = null;
		hardCodedInfo();
		header();
		
		try {		//try-catch-finally to ensure compatibility with all java versions. 
			scanInput = new Scanner(System.in);
			while (blnContinue) {
				displayMenu();
			
				if (scanInput.hasNextInt()) {
					blnContinue = processMenuSelection(scanInput.nextInt());
				}
				else {
					scanInput.nextLine();
					blnContinue = processMenuSelection(0);
				}
			}
		}
		catch (Exception e){
			// Generic error catch - this can be made more specific to the expected errors.
			System.out.println("An unexpected exception has occurred with input");
			
		}
		finally {
			// Close the scanner
			if (scanInput != null) {
				scanInput.close();
			}
		}
		
	}

	private void header() {
		// Display program header information
		System.out.println("Federation Car Rental Payment Tracking System");
		System.out.println("=============================================");
		System.out.println();
	}

	private void displayMenu() {
		// Display the menu for user to select which function to run
		System.out.println("\n\nSelect an option from the menu below:");
		System.out.println("1. Standard Payment");
		System.out.println("2. Loyalty Payment");
		System.out.println("3. Employee Payment");
		System.out.println("4. Display List of Clients");
		System.out.println("5. Generate Report To View Payments Received");
		System.out.println("6. Exit");
		System.out.print("Enter your option: ");

	}
	
	
	
	
	
	
	private void standardPayment() {
				
		for (Client e: standardClient) {
			System.out.printf("%-15s %20s %20s %20s %n", e.getClientID(), e.getName(), e.calculateTotalAmount(), e.calculateDiscount());
		}
			
			
	}
	
	
	
	
	
	private void loyaltyPayment(){
		//loyaltyClient.add((Loyalty) loyalty1);
		for (Client e: loyaltyClient) {
			System.out.printf("%-15s %20s %20s %20s %n", e.getClientID(), e.getName(), e.calculateTotalAmount(), e.calculateDiscount());
		}
		
	}
	
	private void employeePayment(){
		//employeeClient.add((Employee) employee1);
		for (Client e: employeeClient) {
			System.out.printf("%-15s %20s %20s %20s %n", e.getClientID(), e.getName(), e.calculateTotalAmount(), e.calculateDiscount());
		}
		
	}
	
	private void listOfClients() {
		tableTitlePrinter();
		System.out.println("Standard Clients: ");
		for (Client e: standardClient) {
			System.out.printf("%-15s %20s %20s %20s %n", e.getClientID(), e.getName(), e.calculateTotalAmount(), e.calculateDiscount());
		}
		System.out.println("Loyalty Clients:");
		for (Client e: loyaltyClient) {
			System.out.printf("%-15s %20s %20s %20s %n", e.getClientID(), e.getName(), e.calculateTotalAmount(), e.calculateDiscount());
		}
		System.out.println("Employee Clients: ");
		
		
		for (Client e: employeeClient) {
			System.out.printf("%-15s %20s %20s %20s %n", e.getClientID(), e.getName(), e.calculateTotalAmount(), e.calculateDiscount());
		}
		
	}
	
	private void tableTitlePrinter() {
		System.out.printf("%n %-15s %20s %20s %20s %n", "Client ID", "Name", "Total Amount", "Discounted Amount"); 
	}
	
	private void standardClientUserInput() {
		Standard stan = new Standard(0, null, 0);
		Scanner userValue = new Scanner(System.in);
		
		System.out.print("Enter 0(for standard client): ");
		
		
		int userinput1 = userValue.nextInt();
		if (userinput1 == 0) {
			
			System.out.println("Enter the name of Client: ");
			String userinput2 = userValue.next();
			stan.setName(userinput2);
			
			
		} else {
			System.out.println("Please Enter valid input");
		}
		System.out.println("Enter the amount of this payment: ");
		double userinput3 = userValue.nextInt();
		stan.setAmount(userinput3);
		stan.setClientID(clientarray.size()+1);
		standardClient.add(stan);
		clientarray.add(stan);
		//userValue.close();
		
	}
	
	private void loyaltyClientUserInput() {
		Loyalty loyal = new Loyalty(0, null, 0);
		Scanner userValue = new Scanner(System.in);
		System.out.print("Enter 0(for loyalty client): ");
		int userinput1 = userValue.nextInt();
		if (userinput1 == 0) {
			
			System.out.println("Enter the name of Client: ");
			String userinput2 = userValue.next();
			loyal.setName(userinput2);
			
			
		} else {
			System.out.println("Please provide valid input");
		}
		System.out.println("Enter the amount of this payment: ");
		double userinput3 = userValue.nextInt();
		loyal.setAmount(userinput3);
		loyal.setClientID(clientarray.size()+1);	
		loyaltyClient.add(loyal);
		clientarray.add(loyal);
		//userValue.close();
		
	}
	
	private void employeeClientUserInput() {
		Employee employee = new Employee(0, null, 0);
		Scanner userValue = new Scanner(System.in);
		System.out.print("Enter 0(for employee client): ");
		int userinput1 = userValue.nextInt();
		if (userinput1 == 0) {
			
			System.out.println("Enter the name of Client: ");
			String userinput2 = userValue.next();
			employee.setName(userinput2);
			//System.out.println("Enter the amount of this payment: ");
			//double userinput3 = userValue.nextInt();
			
			
			//stan.setAmount(userinput3);
			
		} else {
			System.out.println("Please provide valid input");
			
		}
		System.out.println("Enter the amount of this payment: ");
		double userinput3 = userValue.nextInt();
		employee.setAmount(userinput3);
		employee.setClientID(clientarray.size()+1);	
		
		employeeClient.add(employee);
		clientarray.add(employee);
		
		//userValue.close();
	}
	
	private void displayPaymentReceived() {
		double standardTotalAmount = 0;
		double standardDiscount = 0;
		double loyaltyTotalAmount = 0;
		double loyaltyDiscount = 0;
		double employeeTotalAmount = 0;
		double employeeDiscount = 0;
		double grandTotalAmount = 0;
		double grandTotalDiscount = 0;
		
		for (Standard st: standardClient) {
			standardTotalAmount += st.calculateTotalAmount();
			standardDiscount += st.calculateDiscount();
		}
		for (Employee em: employeeClient) {
			employeeTotalAmount += em.calculateTotalAmount();
			employeeDiscount += em.calculateDiscount();
		}
		for (Loyalty lo: loyaltyClient) {
			loyaltyTotalAmount += lo.calculateTotalAmount();
			loyaltyDiscount += lo.calculateDiscount();
		}
		grandTotalAmount = standardTotalAmount + loyaltyTotalAmount + employeeTotalAmount;
		grandTotalDiscount = standardDiscount + loyaltyDiscount + employeeDiscount;
		
		System.out.printf("%-15s %30s %20s %n", "Standard", standardTotalAmount, standardDiscount);
		System.out.printf("%-15s %30s %20s %n", "Loyalty", loyaltyTotalAmount, loyaltyDiscount);
		System.out.printf("%-15s %30s %20s %n", "Staff", employeeTotalAmount, employeeDiscount);
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%-15s %30s %20s %n", "Total", grandTotalAmount, grandTotalDiscount);
		System.out.println("--------------------------------------------------------------------");
	}
	
	private boolean processMenuSelection(int menuSelection) {
		// Use the input provided by the user to activate the appropriate code function
		
		boolean blnContinue = true;
		
		switch (menuSelection){
		case 1:
			// call method to process standard payments here
			System.out.println("");
			
			tableTitlePrinter();
			standardPayment();
			
			standardClientUserInput();
			System.out.println("--Processing Standard Payment--\n...\n ...\n Finished Processing Payment.\n\n");
			
			
			break;
		case 2:
			// call method to process loyalty rewards payments here
			System.out.println("");
			
			tableTitlePrinter();
			loyaltyPayment();
			
			loyaltyClientUserInput();
			System.out.println("--Processing Loyalty Payment--\n...\n ... \n Finished Processing Payment.\n\n");
			
			break;
		case 3:
			// call method to process employee payments here
			System.out.println("");
			
			tableTitlePrinter();
			employeePayment();
			
			employeeClientUserInput();
			System.out.println("--Processing Employee Payment--\n...\n ... \n Finished Processing Payment.\n\n");
			
			break;
		case 4:
			// call method to  display list of clients here
			System.out.println("\n--List of Clients--");
			listOfClients();
			
			break;
			
		case 5:
			// call method to generate report to display payments received here
			System.out.println("--Report to View Payments Received--");
			System.out.println("--------------------------------------------------------------------");
			System.out.printf("%-15s %30s %20s %n", "Type of Account", "Total Amount Received", "Discounts Given");
			System.out.println("--------------------------------------------------------------------");
			
			displayPaymentReceived();
			
			
			break;
			
		case 6:
			System.out.println("-- Exiting Federation Car Rental Payment Tracking System --\n ....\n  -- Goodbye! --\n");
			blnContinue = false;
			break;
			
		default:
			// no valid selection made
			System.out.println("Invalid selection! A number between 1 and 6 was expected.");
		}		
		return blnContinue;
	}

}//public class Menu
