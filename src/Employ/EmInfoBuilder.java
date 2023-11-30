package Employ;

public class EmInfoBuilder {
	private EmInfo e;
	public EmInfoBuilder(EmInfo e) {
		this.e = e;
	}

	public EmInfoBuilder companyName(String companyName) {
		e.setCompanyName(companyName);
		return this;
	}
	
	public EmInfoBuilder Title(String Title) {
		e.setTitle(Title);
		return this;
	}
	
	public EmInfoBuilder Task(String Task) {
		e.setDescription(Task);
		return this;
	}
	
	public EmInfoBuilder Requirements(String Requirements) {
		e.setRequirements(Requirements);
		return this;
	}
	
	
	
	public EmInfoBuilder startDate(String startDate) {
		e.setStartDate(startDate);
		return this;
	}
	
	public EmInfoBuilder endDate(String endDate) {
		e.setEndDate(endDate);
		return this;
	}
	public EmInfo emInfo() {
		return e;
	}
}
