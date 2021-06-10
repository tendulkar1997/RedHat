package abc.model;

public class Manager extends Employee {
		
	private String departmentName;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(Integer employeeId, String firstName, String lastName, String email, String departmentName) {
		super(employeeId, firstName, lastName, email);
		this.departmentName=departmentName;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Manager [departmentName=" + departmentName + ", toString()=" + super.toString() + "]";
	}
  
}
