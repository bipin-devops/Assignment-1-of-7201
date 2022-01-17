package assign1;

public abstract class Client implements Payment {
	
	
	private int clientID;
	private String name;
	public double amount;
	
	public Client(int clientID, String name, double amount) {
		super();
		
		this.clientID = clientID;
		this.name = name;
		this.amount = amount;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

	
	
	
	
	

	@Override
	public  double calculateTotalAmount() {
		return amount-calculateDiscount();
		
	}
	
	

	@Override
	public abstract double calculateDiscount();

	
	
	
	

}
