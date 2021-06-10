package abc.model;

public enum EmployeeType {
	
	SALARIED("Salaried Employee"),
	HOORLY_PAID("Hourly Paid Employee");
	
	private String message;
	
	private EmployeeType(String message)
	{
		this.message=message;
	}

	public String getMessage() {
		return message;
	}
}
