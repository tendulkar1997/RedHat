package abc.model;

public class Engineer extends Employee {
	
	private String stream;
	
	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Engineer(String stream) {
		super();
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Engineer [stream=" + stream + ", toString()=" + super.toString() + "]";
	}
	
	
}
