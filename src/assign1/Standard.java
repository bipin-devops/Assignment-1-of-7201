package assign1;

public class Standard extends Client {

	private double discountRate = 0;
	
	public Standard(int clientID, String name, double amount) {
		super(clientID, name, amount);
	}

	

	@Override
	public double calculateDiscount() {
		
		
		double discountAmount=  discountRate*amount;
		return discountAmount ;
	}



	

	

	

	
	
	
}
