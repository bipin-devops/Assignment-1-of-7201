package assign1;

public class Employee extends Client {
	
	
	private double discountRate = 0.2;
	
	public Employee(int clientID, String name, double amount) {
		super(clientID, name, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateDiscount() {
		double discountAmount = discountRate*amount;
		return discountAmount;
	}

	
}
