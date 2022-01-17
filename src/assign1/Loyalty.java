package assign1;

public class Loyalty extends Client {

	
	private double discountRate = 0.1;
	
	public Loyalty(int clientID, String name, double amount) {
		super(clientID, name, amount);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public double calculateDiscount() {
		double discountAmount =  discountRate*amount;
		return discountAmount;
	}

	
}
